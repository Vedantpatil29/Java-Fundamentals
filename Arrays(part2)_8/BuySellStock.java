import java.util.*;
public class BuySellStock{
    public static int stockbuysell(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0 ; i<price.length ; i++){
            int sellprice = price[i];

            if(sellprice>buyprice){
                int profit = sellprice - buyprice;  //todays profit
                maxprofit = Math.max(profit , maxprofit);
            }
            else{   //else means buy price more than sell price
               buyprice = sellprice;
            }


        }

        return maxprofit;
    }

    public static void main(String args[]){
        int price[] = {7 , 1,5,3,6,4};

        System.out.println(stockbuysell(price));
    }
}