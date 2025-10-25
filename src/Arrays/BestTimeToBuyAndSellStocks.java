package Arrays;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            int price = prices[i];
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
