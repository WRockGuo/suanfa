package suanfa;

public class mathT {
public static void main(String[] args) {
	int cot=0;
	for (int i = 100; i <= 999; i++) {
		int ge=i%10;
		int shi=i/10%10;
		int bai=i/100%10;
		
		if(i==Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3)) 
		{
			System.out.println(i);
			cot++;
		}
	}
	System.out.println("count:"+cot);
}
}
