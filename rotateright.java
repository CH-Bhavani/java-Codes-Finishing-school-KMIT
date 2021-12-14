import java.util.Scanner;
public class rotateright{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int nr=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<nr;i++){
		int j,last;
		last=arr[arr.length-1];
		for(j=arr.length-1;j>0;j--){
			arr[j]=arr[j-1];
		}
		arr[0]=last;
	}
	for(int k=0;k<arr.length;k++){
		System.out.println(arr[k]+" ");
	}
}
}