package com.kodilla.execution_model.homework;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        if (order.value <= 0 || order.dateOfIssue == null || order.login == null) {
            return false;
        }
        return this.orders.add(order);
    }

    public List<Order> returnOrderBetweenDates(LocalDate date1, LocalDate date2) {
        if (this.orders.size() > 0) {
            return this.orders.stream()
                    .filter(t -> t.getDateOfIssue().isAfter(date1) && t.getDateOfIssue().isBefore(date2))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public List<Order> getOrderOnValue(double valueMin, double valueMax) {
        if (this.orders.size() > 0) {
            return this.orders.stream()
                    .filter(v -> v.getValue() = valueMin && v.getValue() = valueMax)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    public int getSize() {
        return this.orders.size();
    }

    public double getSum() {
        double sum = 0;
        Order order = orders.get();
        sum = order.getValue();
    }
        return sum;
}

