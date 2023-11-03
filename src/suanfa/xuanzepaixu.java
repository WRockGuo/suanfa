package suanfa;
public class xuanzepaixu {
/**
 * @param args
 */
public static void main(String[] args) {
	//打乱一个一维数组
	luanxushuzu lxsz=new luanxushuzu();
	lxsz.printArr();
	int[] tempArr=lxsz.getArrInt();
	//选择排序开始
	xaunze(tempArr);
}

private static void xaunze(int[] tempArr) {
	int n=0;
	for (int i = 0; i < tempArr.length; i++) {
		int minIndex=i;
		for (int j = i+1; j < tempArr.length; j++) {
			if(tempArr[j]<tempArr[minIndex]) {
				minIndex=j;
			}
			n++;
		}
		if (minIndex!=i) {
			int temp=tempArr[i];
			tempArr[i]=tempArr[minIndex];
			tempArr[minIndex]=temp;
		}
	}
	
	for (int i = 0; i < tempArr.length; i++) {
		System.out.print(tempArr[i]+" ");
	}
	System.out.println("\n"+n);
}
}
