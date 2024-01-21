

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * SuhailSharieff
 */





public class SuhailSharieff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This is a program which tells u if u can make two numbers equal by performing either of 2 operations given below:\nsay we have some random integer 'd' then\n1)by (a+d)==(b-d)\n2)by (a-d)==(b+d)");
		System.out.println("enter the number of test cases ");
		int t=sc.nextInt();
		for(int v=0;v<t;v++){
			System.out.println("enter the first number ");
			int a=sc.nextInt();
			System.out.println("enter the second number ");
			int b=sc.nextInt();
			int num=0;
			
			boolean d=false;
			if(a!=b){
				for (int i = 0; i < Math.max(a, b); i++) {
					if(((a+i)==(b-i))||((a-i)==(b+i))){
						d=true;num=i;break;
					}
				}
			}
			else if(a==b){
				d=true;

			}else{d=false;}
			if(d==true){
				System.out.println("yes, you can  make two numbers equal by performing the operations mentioned above by adding and subtracting or subtracting and adding "+num+" to first and second number respectively");

			}else{
				System.out.println("not possible...");
			}
		}
	}
}
