package shujujiegou;

import java.util.function.Consumer;

public class dongtaishuzu {
	private	int size=0;	//数组的实际大小
	private int cap=8;	//容量
	private int[] arr=new int[cap];
	
	public void addLast(int num) {
		// arr[size]=num;
		// size++;
		add(size,num);
	}
	public void add(int index,int num) {
		//形式变量:添加位置index,添加元素num
		//前提条件:添加位置大于等于0,小于数组的实际大小size,意思就是在数组的实际范围内添加元素
		if(index>=0&&index<size) 
		{	
			//先把添加位置腾出来
			System.arraycopy(arr, index, arr, index+1, size-index);
		}
		//再把元素添加到对应位置
		arr[index]=num;
		size++;
	}
	
	public int get(int i) {
		return arr[i];
	}
	public void getAll(Consumer<Integer>consumer) {
		for (int i = 0; i < size; i++) {
			consumer.accept(arr[i]);
			
		}
	}
}
