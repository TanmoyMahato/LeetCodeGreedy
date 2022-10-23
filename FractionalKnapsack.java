/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double ratio[][] = new double[arr.length][2];
        for(int i=0; i<arr.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = arr[i].value/(double)arr[i].weight;
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        int capacity = W;
        double totalValue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            if(capacity>0 && capacity>= arr[(int)ratio[i][0]].weight){
                totalValue += arr[(int)ratio[i][0]].value;
                capacity -= arr[(int)ratio[i][0]].weight;
            }
            else{
                totalValue += ratio[i][1]*capacity;
                break;
            }
        }
        
        return totalValue;
    }
}