package com._520.web.homework._01;


public class Commodity {
    private String name;
    private double price;
    private Integer count;

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
