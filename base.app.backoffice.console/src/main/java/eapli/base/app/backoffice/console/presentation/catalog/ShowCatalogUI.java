package eapli.base.app.backoffice.console.presentation.catalog;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.application.ShowCatalogController;
import eapli.base.productmanagement.domain.Brand;
import eapli.base.productmanagement.domain.ShortDescription;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.ShortDescription;
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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShowCatalogUI extends AbstractUI {
    private ShowCatalogController controller = new ShowCatalogController();
    private List<Category> categories = new ArrayList<>();
    private List<ShortDescription> descriptions = new ArrayList<>();
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
        initialMenu.addItem(MenuItem.of(2, "No filters", showAllProducts()));
        return initialMenu;
    }

    private Menu buildFiltersMenu() {
        final Menu menu = new Menu("Filters");
        menu.addItem(MenuItem.of(0, "Cancel", Actions.SUCCESS));
        menu.addSubMenu(1, buildCategoriesMenu());
        menu.addSubMenu(2, buildDescriptionMenu());
        menu.addSubMenu(3, buildBrandMenu());
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
                buildSortMenu(products);
                } else
                    System.out.println("There are no products of this category!");
                return true;
            }
        }
                ;
    }

    private boolean buildSortMenu (List<Product> products) {
        System.out.println("\n\nDo you want to sort?");
        final Menu sortMenu = new Menu("Sort");
        final MenuRenderer renderer = new VerticalMenuRenderer(sortMenu, MenuItemRenderer.DEFAULT);
        int counter = 0;
        sortMenu.addItem(MenuItem.of(counter++, "No sort", Actions.SUCCESS));
        sortMenu.addItem(MenuItem.of(1, "By price", sortByPrice(products)));
        sortMenu.addItem(MenuItem.of(2, "Description Alphabetically", sortByDescription(products)));
        return renderer.render();
    }

    private Action sortByPrice(List<Product> products) {
        return new Action() {
            @Override
            public boolean execute() {
                Collections.sort(products, new Comparator<Product>() {
                    public int compare(Product p1, Product p2) {
                        return p1.basePrice().compareTo(p2.basePrice());
                    }
                });
                System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                for (Product p : products) {
                    new ProductPrinter().visit(p);
                }
                return true;
            }
        }
        ;
    }

    private Action sortByDescription(List<Product> products) {
        return new Action() {
            @Override
            public boolean execute() {
                Collections.sort(products, new Comparator<Product>() {
                    public int compare(Product p1, Product p2) {
                        return p1.shortDescription().compareTo(p2.shortDescription());
                    }
                });
                System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                for (Product p : products) {
                    new ProductPrinter().visit(p);
                }
                return true;
            }
        }
                ;
    }

    private Menu buildDescriptionMenu() {
        final Menu descriptionMenu = new Menu("Description");
        int counter = 0;
        descriptionMenu.addItem(MenuItem.of(counter++, "Cancel", Actions.SUCCESS));
        for (final ShortDescription description : controller.getDescriptions()) {
            descriptionMenu.addItem(MenuItem.of(counter++, description.toString(), showDescriptionProducts(description)));
        }
        return descriptionMenu;
    }

    private Action showDescriptionProducts(ShortDescription description) {
        return new Action() {
            @Override
            public boolean execute() {
                List<Product> products = controller.getDescriptionProducts(description);
                if (products.size() != 0) {
                    System.out.println(String.format("%-20s%-30s%-15s%-15s%s", "#UIC#", "#Description#", "#Brand#", "#Category#", "#Price#"));
                    for (Product p : products) {
                        new ProductPrinter().visit(p);
                    }
                    buildSortMenu(products);
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
                    buildSortMenu(products);
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
