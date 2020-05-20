package com.kodilla.exception.homework;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDosentExistException {
        List<Warehouse> orders = new ArrayList<>();

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("OF1"));
        warehouse.addOrder(new Order("OS2"));
        warehouse.addOrder(new Order("OT3"));
        warehouse.addOrder(new Order("OF4"));

        System.out.println(warehouse.getOrderList());
        try {
            System.out.println(warehouse.getOrder("OF4"));
        } catch (OrderDosentExistException e) {
            System.out.println("Order not found.");
        }
    }


}
