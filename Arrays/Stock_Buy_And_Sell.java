package Arrays;

public class Stock_Buy_And_Sell {
//...........OPTIMAL APPROACH............

static int maxProfit(int[] arr) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
    }

    
    // //...............BRUTE FORCE...........
    // private static int maxProfit(int[] arr) {
    //     int maxPro = 0 ;
        
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
                
    //             if(arr[j] > arr[i]){
    //                 int cost = arr[j] - arr[i];
    //                 maxPro =  Math.max(cost , maxPro); 
    //             }
    //         }
    //     }
    //     return maxPro;
    // }


    public static void main(String[] args) {
        
    int arr[] = {7,1,5,3,6,4};

    int maxPro = maxProfit(arr);
    System.out.println("Max profit is: " + maxPro);

    }

}
