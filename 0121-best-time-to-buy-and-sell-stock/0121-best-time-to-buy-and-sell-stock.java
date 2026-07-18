class Solution {

    public int maxProfit(int[] prices) {
        int max_profit =0;
        int buy = prices[0];
        
        for(int i =1;i<prices.length;i++){
            int current = prices[i] - buy;
            if(current > max_profit){
                max_profit = current;
            } if(prices[i] < buy){
               buy = prices[i] ;
            }
        }
        return max_profit;
    }
}
    


//         int buy =prices[0];
//         int max=0;
//         int n=prices.length;
//         int profit=0;
//         for(int i=0;i<n;i++){
//             if(prices[i]<buy){
//                 buy=prices[i];
//                 max=buy;
//             }
            
//             for(int j=i+1;j<n;j++){
//                 if(prices[j]>max){
//                     max=prices[j];

//                 }if(profit<max-buy){
//                     profit=max-buy;
//                 }
//             }
            

//         }
//         return profit;
      
//    } 
    
