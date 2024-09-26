package com.mycompany.observerpatterndemo;


import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String stock, double price);
}

class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private String stock;
    private double price;

    public void setStockPrice(String stock, double price) {
        this.stock = stock;
        this.price = price;
        notifyAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }
}

class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " notified. " + stock + " price is now: $" + price);
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Jane");

        market.addObserver(investor1);
        market.addObserver(investor2);

        market.setStockPrice("AAPL", 150.00);
    }
}
