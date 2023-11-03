package suanfa;
public class charu {
public static void main(String [] args) {
	//打乱一个一维数组
	luanxushuzu lxsz=new luanxushuzu();
	lxsz.printArr();
	int[] tempArr=lxsz.getArrInt();
	extracted(tempArr);
}

private static void extracted(int[] tempArr) {
	//插入排序
	for (int i = 1; i < tempArr.length; i++) {
		int postion=i;
		int pos_val=tempArr[i];
		
		while(postion>0&&pos_val<tempArr[postion-1]) {
			tempArr[postion]=tempArr[postion-1];
			postion=postion-1;
		}
		tempArr[postion]=pos_val;
	}
	//遍历数组
	for (int i = 0; i < tempArr.length; i++) {
		System.out.print(tempArr[i]+" ");
	}
}
}
