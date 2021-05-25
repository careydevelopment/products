package us.careydevelopment.model.products;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Catalog<T extends BaseProduct> {

    private List<CatalogItem<T>> items;

    public List<CatalogItem<T>> getItems() {
        return items;
    }

    public void setItems(List<CatalogItem<T>> items) {
        this.items = items;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
