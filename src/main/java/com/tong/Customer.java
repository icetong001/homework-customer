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
        price = cost - discount;
        if (discount < 100) {
            System.out.println(id + "\t" + cost + "\t" + "    " + discount + "\t" + price);

        } else {

            System.out.println(id + "\t" + cost + "\t" + discount + "\t" + price);


        }
    }
}