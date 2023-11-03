package suanfa;
//查重问题的第一种解法:线性法,n^2步
public class chachong1Line {
public static void main(String[] args) {
	int [] arr= {2,2,3,4,5,8,8,7,6,0};
	int n=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(i!=j&&arr[i]==arr[j]) {
				System.out.print("有重复值 ");
				System.out.println(arr[i]+" base "+i);
			}
			n++;
		}
	}
	System.out.println(n);
}
}
