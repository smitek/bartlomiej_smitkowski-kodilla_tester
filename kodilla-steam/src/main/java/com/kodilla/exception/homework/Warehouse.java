package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList() {
        return orders;
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDosentExistException{
        Order orderNr = orders.stream()
                .filter(o->o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()-> new OrderDosentExistException());
        return orderNr;
    }


}
