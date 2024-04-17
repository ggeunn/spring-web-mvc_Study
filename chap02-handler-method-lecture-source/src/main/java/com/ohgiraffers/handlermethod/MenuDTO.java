package com.ohgiraffers.handlermethod;

public class MenuDTO {

    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {}

    public MenuDTO(String name, int categoryCode, int price, String orderableStatus) {
        this.name = name;
        this.categoryCode = categoryCode;
        this.price = price;
        this.orderableStatus = orderableStatus;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
