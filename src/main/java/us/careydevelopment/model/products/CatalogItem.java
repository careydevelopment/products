package us.careydevelopment.model.products;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CatalogItem<T extends BaseProduct> {

    private T product;
    private Integer quantity;
    
    public T getProduct() {
        return product;
    }
    public void setProduct(T product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
