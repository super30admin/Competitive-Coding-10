package CompetitiveCoding_Dec20;

public class BuyAndSellStocks {

	// Time complexity: O(n) 
	
	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,4,6};   // {7,1,5,3}
		int res = findMaxProfit(arr);
		System.out.println(res);
	}

	private static int findMaxProfit(int[] arr) {
		
		// edge
		if (arr == null || arr.length == 0) {
			return 0;
		}
		
		int result = 0;
		
		// logic
		// i=0,1,2
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] > arr[i]) //upward trend 
				{
				result += arr[i+1]-arr[i]; // profit
				}
		}
		
		return result;
	}
	
}
