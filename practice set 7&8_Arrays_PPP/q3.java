import java.util.*;
public class q3{
    public static int buysellstock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0 ; i<price.length ; i++){
            int sellprice = price[i];

            if(buyprice < sellprice){
                int profit = sellprice - buyprice;
                maxprofit = Math.max(profit , maxprofit);
            }
            else{
                buyprice = sellprice;
            }
        }
        return maxprofit;
    }

    public static void main(String args[]){
        int price[] = {4,6,7,9,10};

        System.out.println(buysellstock(price));
    }
}