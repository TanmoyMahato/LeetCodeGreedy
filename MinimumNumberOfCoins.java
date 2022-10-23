class Solution{
    static List<Integer> minPartition(int amount)
    {
        int coins[] = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        List<Integer> totalCoins = new ArrayList<>();
        
        int i=coins.length-1;
        while(i>=0){
            if(amount == 0){
                break;
            }
            else if(coins[i] <= amount){
                totalCoins.add(coins[i]);
                amount -= coins[i];
                //i = coins.length-1;
            }
            else{
                i--;
            }
        }
        
        return totalCoins;
    }
}