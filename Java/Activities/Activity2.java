package activities;

public class Activity2 {

	public static void main(String[] args) {
		// given array
		int[] numArr = {10, 77, 10, 54, -11, 10};
		// total sum of 10s
		int sum = 0;
		// iterate through array. finding 10s
		for (int num :numArr) {
			// check if  number is 10
			if(num==10) {
				//add value to sum
				sum+=num;
			}
			// to prevent extra iterations
			if (sum>30) {
				break;
			}
		}
		//check the sum value
		if (sum==30) {
			System.out.println("sum value is :"+ sum);
		}else {
			System.out.println("sum value is not 30");
		
				
			}
			
		}

	}

