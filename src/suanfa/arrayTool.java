package suanfa;
import java.util.Arrays;
import java.util.Comparator;

public class arrayTool {
public static void main(String[] args) {
	//打乱一个一维数组
	luanxushuzu lxsz=new luanxushuzu();
	lxsz.printArr();
	Integer[] tempArr=lxsz.getArrInteger();
	//array数组工具库的排序算法
		//o2-o1逆序
		//o1-o2顺序
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
