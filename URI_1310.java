import java.util.Scanner;

public class Main{  //Class name subject to change
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int number_of_days, per_day_cost, profit=0, sum;
			
			number_of_days = sc.nextInt();
			per_day_cost = sc.nextInt();
			
			int[] revenue = new int[number_of_days];
			for(int c=0;c<revenue.length;c++){
				revenue[c] = sc.nextInt();
			}
			
			int i=0, day_count, temp_profit;
			while(i < revenue.length){
				temp_profit=0; day_count=0; sum=0;
				
				for(int c=i;c<revenue.length;c++){
					sum = sum + revenue[c];
					day_count++;
					
					temp_profit = sum - (day_count*per_day_cost);
					if(profit < temp_profit){
						profit = temp_profit;
					}
				}	
				
				i++;
			}
			
			System.out.println(profit);
		}
		
		
	}
}
