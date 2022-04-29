package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;



    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;

    }
    public int shipFeed(){
        return delivery.price;
    }
    public int total(){
        if(delivery instanceof ShopeeDelivery){

        }else{
            return amount +shipFeed;
        }
    }




}
