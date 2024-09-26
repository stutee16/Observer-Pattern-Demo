# Observer Pattern Demo

This project demonstrates the **Observer Design Pattern** in Java using a stock market scenario. The Observer Pattern is a behavioral design pattern where an object (called **Subject**) maintains a list of its dependents (called **Observers**) and notifies them of any state changes, typically by calling one of their methods.

## Overview

In this project, the **StockMarket** class acts as the **Subject**, and it notifies multiple **Investor** objects (which are Observers) whenever the stock price changes. The **Investor** objects will be notified with the updated stock price in real-time as soon as the price is changed in the stock market.

### Problem Description

- The **StockMarket** is a class that holds the information about the stock price.
- The **Investor** is an observer that subscribes to changes in the stock market and gets notified when a stock price changes.
- Multiple investors can subscribe to the stock market and receive updates when a stock price changes.
- When the stock price is updated in the **StockMarket**, all registered observers (investors) are notified with the new price.

### Components

1. **Observer Interface**: This interface defines the `update()` method that all observers must implement to receive notifications from the subject.
   - `void update(String stock, double price);`

2. **StockMarket Class**: This class holds the state of the stock and manages observers. It has methods to:
   - Add observers to the list.
   - Notify all observers when the stock price changes.
   - Update the stock price.

3. **Investor Class**: This class implements the **Observer** interface. It receives stock price updates from the **StockMarket** and prints the new price.

4. **ObserverPatternDemo**: The main class where the entire process is demonstrated.

