import java.util.Scanner;

public class tp {
	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int s2=fact(n);
		System.out.println(n+"�Ľ׳�Ϊ��");
		System.out.println(s2);
	}
	public static int fact(int n) {
		int fact=1;
		/*forѭ��
		 * for(int i=1;i<=n;i++) {
			fact=fact*i;
		}*/
		/*whileѭ��
		 * int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}*/
		/*
		int i=1;
		do {
			fact*=i;
			i++;
		}while(i<=n);
		return fact;
		*/
		if(n==1)
			return 1;
		else
			return fact(n-1)*n;
	}
}
