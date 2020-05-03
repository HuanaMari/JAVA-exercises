package com.example.test;

import java.util.Map;

public class Main {
    public static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 120);
        stockList.addStock(temp);

        temp = new StockItem("chair", 0.86, 240);
        stockList.addStock(temp);

        temp = new StockItem("phone", 99.86, 90);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.08, 240);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 50);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.72, 220);
        stockList.addStock(temp);

        temp = new StockItem("vase", 1.28, 20);
        stockList.addStock(temp);

        temp = new StockItem("door", 68.42, 70);
        stockList.addStock(temp);

        temp = new StockItem("cake", 2.87, 6);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timBasket = new Basket("Tim");
        sellItem(timBasket, "cup", 2);
        System.out.println(timBasket);

        sellItem(timBasket, "cup", 1);
        System.out.println(timBasket);

        sellItem(timBasket, "spanner", 1);
        System.out.println(timBasket);

        sellItem(timBasket, "cake", 1);
        System.out.println(timBasket);

        System.out.println(stockList);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
