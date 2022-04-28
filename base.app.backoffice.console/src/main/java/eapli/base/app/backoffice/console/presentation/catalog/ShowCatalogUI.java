package eapli.base.app.backoffice.console.presentation.catalog;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.application.ShowCatalogController;
import eapli.base.productmanagement.domain.Brand;
import eapli.base.productmanagement.domain.Description;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.actions.Action;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;
import eapli.framework.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ShowCatalogUI extends AbstractUI {
    private ShowCatalogController controller = new ShowCatalogController();
    private List<Category> categories = new ArrayList<>();
    private List<Description> descriptions = new ArrayList<>();
    private List<Brand> brands = new ArrayList<>();


    private boolean showCatalog() {
        return showInitialOptions();
    }

    private boolean showInitialOptions() {
        final Menu initialMenu = buildInitialMenu();
        final MenuRenderer renderer = new VerticalMenuRenderer(initialMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildInitialMenu() {
        final Menu initialMenu = new Menu();
        int counter = 0;
        initialMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        initialMenu.addSubMenu(1, buildFiltersMenu());
        return initialMenu;
    }

    private Menu buildFiltersMenu() {
        final Menu menu = new Menu("Filters >");

        menu.addSubMenu(1, buildCategoriesMenu());
        menu.addSubMenu(2, buildDescriptionMenu());
        menu.addSubMenu(3, buildBrandMenu());
        menu.addItem(MenuItem.of(4, "No filters", showAllProducts()));
        menu.addItem(MenuItem.of(0, "Cancel", Actions.SUCCESS));
        return menu;
    }

    private Action showAllProducts() {
        return new Action() {
            @Override
            public boolean execute() {
                System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#","#Brand#", "#Category#", "#Price#"));
                Iterable<Product> products = controller.showProducts();
                for (Product p : products) {
                    new ProductPrinter().visit(p);
                }
                return true;
            }
        };
    }

    private Menu buildCategoriesMenu() {
        final Menu categoriesMenu = new Menu("Categories");
        int counter = 0;
        categoriesMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        for (final Category category : controller.getCategories()) {
            categoriesMenu.addItem(MenuItem.of(counter++, category.toString(), showCategoryProducts(category)));
        }
        return categoriesMenu;
    }

    private Action showCategoryProducts(Category category) {
        return new Action() {
            @Override
            public boolean execute() {
                List<Product> products = controller.getCategoryProducts(category);
                if (products.size() != 0) {
                    System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                    for (Product p : products) {
                        new ProductPrinter().visit(p);
                    }
                } else
                    System.out.println("There are no products of this category!");
                return true;
            }
        }

                ;
    }

    private Menu buildDescriptionMenu() {
        final Menu descriptionMenu = new Menu("Description");
        int counter = 0;
        descriptionMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        for (final Description description : controller.getDescriptions()) {
            descriptionMenu.addItem(MenuItem.of(counter++, description.toString(), showDescriptionProducts(description)));
        }
        return descriptionMenu;
    }

    private Action showDescriptionProducts(Description description) {
        return new Action() {
            @Override
            public boolean execute() {
                List<Product> products = controller.getDescriptionProducts(description);
                if (products.size() != 0) {
                    System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                    for (Product p : products) {
                        new ProductPrinter().visit(p);
                    }
                } else
                    System.out.println("There are no products with this description!");
                return true;
            }
        };
    }

    private Menu buildBrandMenu() {
        final Menu brandMenu = new Menu("Brand");
        int counter = 0;
        brandMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        for (final Brand brand : controller.getBrands()) {
            brandMenu.addItem(MenuItem.of(counter++, brand.toString(), showBrandProducts(brand)));
        }
        return brandMenu;
    }

    private Action showBrandProducts(Brand brand) {
        return new Action() {
            @Override
            public boolean execute() {
                List<Product> products = controller.getBrandProducts(brand);
                if (products.size() != 0) {
                    System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                    for (Product p : products) {
                        new ProductPrinter().visit(p);
                    }
                } else
                    System.out.println("There are no products of this brand!");
                return true;
            }
        }

                ;
    }

    @Override
    public String headline() {
        return "Products Catalog";
    }

    @Override
    protected boolean doShow() {
        return showCatalog();
    }
}
