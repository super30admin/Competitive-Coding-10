//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Sol{
    public static void main(String args[]){
        Sol obj= new Sol();
        int arr[]= new int[]{5,4,3,2,1};
        System.out.println(maxProfit(arr));
    }
public static int maxProfit(int[] stock) {
    if(stock==null || stock.length==0)
        return 0;
    int profit=0;
    for(int i=0;i<stock.length-1;i++){//add to profit the succesive number whose difference is positie.
        if(stock[i+1]-stock[i]>0)
            profit+=(stock[i+1]-stock[i]);
    }
    return profit;
}
}