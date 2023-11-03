package shujujiegou;

public class test {
	public static void main(String[] args) {
		dongtaishuzu dtsz=new dongtaishuzu();
		dtsz.addLast(1);
		//System.out.println(dtsz.get(0));
		dtsz.add(0, 2);
		//System.out.println(dtsz.get(0));
		//System.out.println();
		//此处是函数式编程
		dtsz.getAll((element)->{
			System.out.println(element);
		});
	}
}
