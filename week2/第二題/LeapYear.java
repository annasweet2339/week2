import java.util.*;
class LeapYear {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.print("輸入年:");
		int num=op.nextInt();
		System.out.print("|閏年");
		for(int i=1;i<=num;i++){
				if(i%400==0||(i%4==0&&i%100!=0)){
					System.out.print("|\t"+i);
				}
		}
		System.out.print("|\n");
	}
}