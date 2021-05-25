package us.careydevelopment.model.products;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public abstract class BaseProduct<T> {

    @NotBlank(message = "Please provide a product name")
    @Size(max = 50, message = "Product name must be between 1 and 50 characters")
    private String name;

    @Size(max = 255, message = "Product must not exceed 255 characters")
    private String description;
    
    @NotNull(message = "Please provide a product type")
    private ProductType productType;

    private List<Price> prices = new ArrayList<>();

    private List<ProductAttribute> attributes;
    
    /**
     * Parent ID groups related products, like variations of the same t-shirt.
     * 
     * It can be null if the product is unique.
     * 
     * If can also be set to the ID of the product itself.
     * 
     * All that matters is that all variations of the same product share the same parent ID.
     */
    private T parentId;
    
    public abstract T getId();
    
    public abstract void setId(T id);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
    
    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public void addPrice(Price price) {
        prices.add(price);
    }
    
    public List<ProductAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ProductAttribute> attributes) {
        this.attributes = attributes;
    }
    
    public T getParentId() {
        return parentId;
    }

    public void setParentId(T parentId) {
        this.parentId = parentId;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
