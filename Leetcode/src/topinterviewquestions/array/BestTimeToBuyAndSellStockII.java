package topinterviewquestions.array;

public class BestTimeToBuyAndSellStockII {

   public int maxProfit(int[] prices) {
      
   	int totalProfit = 0;
   	
   	for(int i=0; i<prices.length-1; i++) {
   		
   		if(prices[i+1] > prices[i]) {
   			totalProfit += prices[i+1] - prices[i];
   		}
   		
   	}
   	return totalProfit;
   	
   }
	
   
   public static void main(String[] args) {
   	
   	System.out.println(
   			new BestTimeToBuyAndSellStockII().maxProfit(
   					new int[] { 7,1,5,3,6,4 }));
   	
   }
   
   
}
