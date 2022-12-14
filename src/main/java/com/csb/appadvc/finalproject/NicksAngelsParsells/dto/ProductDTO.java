package com.csb.appadvc.finalproject.NicksAngelsParsells.dto;

import com.csb.appadvc.finalproject.NicksAngelsParsells.model.Product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;


public class ProductDTO {

    private Long id;

    private String barcode;

    @PositiveOrZero(message = "Quantity must not be a negative number")
    private long quantity;
    @PositiveOrZero(message = "Price mus    t not be a negative number")
    private long price;
    @NotBlank(message = "Name is required")
    private String name;
    private String description;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
