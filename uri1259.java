import java.util.Scanner;
import java.util.Arrays;
public class Main {  // Class name subject to change
	public static void main(String[] args){
		Scanner key1 = new Scanner(System.in);
		int n = key1.nextInt();
		int[] a = new int[n];
		int evenCount=0,oddCount=0;
		for(int c=0;c<n;c++){
			a[c]=key1.nextInt();
			if(a[c]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		int[] e = new int[evenCount];
		int[] o = new int[oddCount];
		int eCounter=0,oCounter=0;
		for(int c=0;c<a.length;c++){
			if(a[c]%2==0){
				e[eCounter]=a[c];
				eCounter++;
			}
			else{
				o[oCounter]=a[c];
				oCounter++;
			}
		}
		Arrays.sort(e);
		Arrays.sort(o);
		for(int c=0;c<e.length;c++){
			System.out.println(e[c]);
		}
		for(int c=o.length-1;c>=0;c--){
			if(c<0){}
			else{
				System.out.println(o[c]);
			}
		}
		
	}

}
