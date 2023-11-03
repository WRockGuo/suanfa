package suanfa;
import java.util.ArrayList;

public class chachong2 {
public static void main(String[] args) {
	int [] arr= {2,2,3,4,5,8,8,7,6,0};
	method1(arr);
	System.out.println(method2(arr, 200));
}
private static ArrayList<Integer> method2(int[]arr,int num) {
	ArrayList<Integer> list=new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==num) {
			list.add(i);
		}
	}
	return list;
}

private static void method1(int[] arr) {
	int n=0;
	int [] arrVal=new int[10];
	for (int i = 0; i < arr.length; i++) {
		if(arrVal[arr[i]]==0){
			arrVal[arr[i]]=1;
		}else {
			System.out.println("ÖØºÏÊý "+arr[i]);
		}
		n++;
	}
	System.out.println(n);
}
}
