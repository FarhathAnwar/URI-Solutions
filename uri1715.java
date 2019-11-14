import java.util.Scanner;

public class uri1715{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,m, count, goal, goal_scorers;
		
		
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
			
			count=0;
			goal_scorers=0;
			while(count<n){
				//System.out.println("Match number: "+(count+1));
				boolean flag=true;
				for(int i=0;i<m;i++){
					goal = sc.nextInt();
					if(goal==0){
						flag=false;
						//break;
					}
				}
				if(flag){
					goal_scorers++;
				}
				count++;
			}
			
			System.out.println(goal_scorers);
		}
	}
}