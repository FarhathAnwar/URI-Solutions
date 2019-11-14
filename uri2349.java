//ACCEPTED
import java.util.Scanner;

public class uri2349{
	
	static int station_count=0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int posts,commands,devastated_state;
		posts=sc.nextInt();
		commands=sc.nextInt();
		devastated_state=sc.nextInt();
		
		int[] command_input = new int[commands];
		for(int c=0;c<commands;c++){
			command_input[c] = sc.nextInt();
		}
		
		int count=1, direction=1;
		
		if(devastated_state==1)
			station_count+=1;
		
		for(int i=0;i<command_input.length;i++){
			direction = command_input[i];
			
			if(direction==1){
				if(count==posts){
					count=0;
				}
				count+=1;
				checkStateCount(count,devastated_state);
			}
			else if(direction== (-1)){
				if(count==1){
					count = posts+1;
				}
				count-=1;
				//System.out.println("count in -1: "+count);
				checkStateCount(count,devastated_state);
			}
		}
		
		System.out.println(station_count);
		
		sc.close();
	}
	
	public static void checkStateCount(int count, int devastated_state){
		if(count==devastated_state)
			station_count+=1;
	}
}