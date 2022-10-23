class Solution
{
    public static int activitySelection(int start[], int end[], int n)
    {
        int output = 0;
        
        //create 2d-array and store indeces, start, end values of activities
        int arr[][] = new int[n][3];
        for(int i=0; i<n; i++){ 
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        
        //sort 2d-array on the basis of end time in ascending order
        Arrays.sort(arr, Comparator.comparingInt(o -> o[2]));
        
        int endTime = arr[0][2];
        output++;
        for(int i=0; i<n; i++){
            int startTime = arr[i][1];
            if(startTime > endTime){
                output++;
                endTime = arr[i][2];
            }
        }
        
        return output;
    }
}