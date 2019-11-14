import java.util.Scanner;
public class URI1162DataStructures {
	public static void main(String[] args){
		Scanner key1 = new Scanner(System.in);
		int testcase = key1.nextInt();
		for(int x=0;x<testcase;x++){
			int length = key1.nextInt();
			int[] a = new int[length];
			for(int c=0;c<a.length;c++){
				a[c] = key1.nextInt();
			}
			int swap=0;
			
			//******INSERTION SORT********
			
			for(int i=1;i<a.length;i++){
				int temp = a[i];
				for(int j=i-1;j>=0 && temp<a[j];j--){
					swap++;
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			System.out.println("Optimal train swapping takes "+swap+" swaps.");
		}
	}
}