package com.Arrays;
import java.util.*;
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit "+ BuyAndSellStocks(prices));
    }
    public static int BuyAndSellStocks(int prices[]){
//      STEPS
//      1.) create two variables (buyPrice = +infinity) (MaxProfit=0);
//      2.) if (buy<price[])

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int index=0; index<prices.length; index++){
            if(buyPrice<prices[index]){
                int currentProfit = prices[index] - buyPrice;
                maxProfit = Math.max(maxProfit,currentProfit);
            }else{
                buyPrice = prices[index];
            }
        }
        return maxProfit;
    }
}
