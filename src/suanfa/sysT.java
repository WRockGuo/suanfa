package suanfa;
//ͨ��system.currenttimemills��õ�ǰ����ʱ��(������ʽ)
public class sysT {
public static void main(String[] args) {
	long timeSt=System.currentTimeMillis();
	for (int i = 1; i < 100000; i++) {
		boolean falg=isprime2(i);
		if (falg) {
			System.out.println(i);
		}
	}
	long timeEx=System.currentTimeMillis();
	System.out.println(timeEx-timeSt);
	
	//���鿽��
	long time1=System.currentTimeMillis();
	int[] arr1= {0,1,2,3,4,5,6,7,8,9};
	int[] arr2=new int[arr1.length];
	System.arraycopy(arr1, 0, arr2, 0, arr1.length);
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+" ");
	}
	long time2=System.currentTimeMillis();
	System.out.println();
	System.out.println(time2-time1);
}
public static boolean isprime1(int num) {
	for (int i = 2; i < num; i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
public static boolean isprime2(int num) {
	for (int i = 2; i <=Math.sqrt(num); i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
}
