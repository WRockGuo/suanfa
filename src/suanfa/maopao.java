package suanfa;
public class maopao {
public static void main(String [] args) {
	//打乱一个一维数组
	luanxushuzu lxsz=new luanxushuzu();
	lxsz.printArr();
	int[] tempArr=lxsz.getArrInt();
	maopaoM(tempArr);

}

private static void maopaoM(int[] tempArr) {
	//冒泡排序开始
	int exc;
	for (int j = 0; j < tempArr.length; j++) {
		for (int j2 = 0; j2 < tempArr.length-1-j; j2++) {
			if(tempArr[j2] > tempArr[j2+1]) {
				exc=tempArr[j2];
				tempArr[j2]=tempArr[j2+1];
				tempArr[j2+1]=exc;
			}
			for (int k = 0; k < tempArr.length; k++) {
				System.out.print(tempArr[k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	for (int j3 = 0; j3 < tempArr.length; j3++) {
		System.out.print(tempArr[j3]+" ");
	}
}
}
