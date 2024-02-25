class Solution {
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int val=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            val=prices[i]-min;
            if(profit<val){
                profit=val;
            }

        }
        return profit;
    }
  public static void main(String[] arg){
    int[] prices = {7,1,5,3,6,4};

  int profit= maxProfit(prices);
    System.out.println("Maximum Profit "+profit);
  }
}
