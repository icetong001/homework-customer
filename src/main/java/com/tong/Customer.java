package com.tong;

public class Customer {
    String id;
    int cost;
    int discount;
    int price;

    public Customer(String id, int cost, int discount, int price) {
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.price = price;

    }

    public void print() {
        System.out.println(id + "\t" + cost + "\t" + discount + "\t" + price);
    }

}
