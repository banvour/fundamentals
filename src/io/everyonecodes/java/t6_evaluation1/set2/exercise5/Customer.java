package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.util.List;
import java.util.Objects;

public class Customer {
    private final String name;
    private final double money;
    private final List<Integer> itemIds;

    public Customer(String name, double money, List<Integer> itemIds) {
        this.name = name;
        this.money = money;
        this.itemIds = itemIds;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return Double.compare(that.money, money) == 0 && Objects.equals(name, that.name) && Objects.equals(itemIds, that.itemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, itemIds);
    }

    @Override
    public String toString() {
        return "CustomerRecord{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", itemIds=" + itemIds +
                '}';
    }
}