package suanfa;
import java.util.Arrays;
import java.util.Comparator;

public class arrayTool {
public static void main(String[] args) {
	//����һ��һά����
	luanxushuzu lxsz=new luanxushuzu();
	lxsz.printArr();
	Integer[] tempArr=lxsz.getArrInteger();
	//array���鹤�߿�������㷨
		//o2-o1����
		//o1-o2˳��
	Arrays.sort(tempArr,new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
	});
	System.out.println(Arrays.toString(tempArr));
}
}
