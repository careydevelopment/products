package us.careydevelopment.model.products;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ProductAttribute {

    private String code;
    private String name;
    private Object value;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
