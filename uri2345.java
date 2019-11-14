//ACCEPTED
import java.util.Scanner;
import java.util.Arrays;

public class uri2345{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] skill_level = new int[4];
		for(int c=0;c<skill_level.length;c++){
			skill_level[c]=sc.nextInt();
		}
		Arrays.sort(skill_level);
		int smallest_difference;
		
		//smallest_difference = (skill_level[0]+skill_level[3]) - (skill_level[1]+skill_level[2]);
		smallest_difference = Math.min((Math.abs((skill_level[0]+skill_level[2])-(skill_level[1]+skill_level[3]))),(Math.abs((skill_level[0]+skill_level[3])-(skill_level[1]+skill_level[2]))));
		System.out.println(smallest_difference);
	}
}