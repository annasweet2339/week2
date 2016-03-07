import java.util.*;
class Num1Num2 {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.print("輸入數字1:");
		float num1=op.nextFloat();
		System.out.print("輸入數字2:");
		float num2=op.nextFloat();
		System.out.print("1)+\t2)-\t3)*\t4)/:");
		int num3=op.nextInt();
		switch(num3)
		{
			case 1:
				System.out.print("數字1+數字2:"+(num1+num2));
				break;
			case 2:
				System.out.print("數字1-數字2:"+(num1-num2));
				break;
			case 3:
				System.out.print("數字1*數字2:"+(num1*num2));
				break;
			case 4:
				try{
					float num = num1/num2;
					if(num2!=0.0)
						System.out.print("數字1/數字2:"+num);
					else
						System.out.print("錯誤");
				}
				catch(Exception expectaion)
				{
					System.out.print("錯誤");
				}
				break;
		}
		
	}
}