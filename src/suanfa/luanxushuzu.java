package suanfa;
import java.util.Arrays;
import java.util.Random;

public class luanxushuzu {
	//打乱一个一维数组
	private Integer [] tempArr =
        {   0,  1,  2,  3,
            4,  5,  6,  7,
            8,  9,  10, 11,
            12, 13, 14, 15  };
	public luanxushuzu() {
		// TODO Auto-generated constructor stub
		Random rs=new Random();
		for(int i=0;i<tempArr.length;i++)
		{
			int index = rs.nextInt(tempArr.length);
			int temp = tempArr[i];
			tempArr[i] = tempArr[index];
			tempArr[index] = temp;
		}
	}
	public void printArr() {
		for (int j = 0; j < tempArr.length; j++) {
			System.out.print(tempArr[j]+" ");
		}
		System.out.println();
	}
	public int[] getArrInt() {
		int [] arr2=new int[16];
		for (int i = 0; i < tempArr.length; i++) {
			arr2[i]=tempArr[i];
		}
		return arr2;
	}
	public Integer[] getArrInteger() {
		Integer[] arr2=Arrays.copyOf(tempArr, 16);
		return arr2;
	}
}
