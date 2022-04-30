package eapli.base.app.backoffice.console.presentation.catalog;

import eapli.base.productmanagement.domain.Product;

import eapli.framework.visitor.Visitor;

public class ProductPrinter implements Visitor<Product> {
    @Override
    public void visit(final Product visitee) {
        System.out.println(String.format("%-20s%-30s%-15s%-15s%s", visitee.getUniqueInternalCode(), visitee.getShortDescription(), visitee.getBrand(), visitee.getCategory().getDescription(), visitee.getBasePrice()));
    }
}
