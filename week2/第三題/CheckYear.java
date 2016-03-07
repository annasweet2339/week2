import java.util.*;
class CheckYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try{
			int y,m,d;
			System.out.print("年:");
			y=input.nextInt(); 
			System.out.print("月:");
			m=input.nextInt();
			System.out.print("日:");
			d=input.nextInt();
			Day day=new Day(y,m,d);
			if(day.Check()==true){
				System.out.println(y+","+m+","+d+"正確!");
			}
			else{
				System.out.println(y+","+m+","+d+"錯誤!");
			}
		}catch(Exception e){
			System.out.println("錯誤!");
		}
		
	}
}
class Day{
	int y,m,d;
	public Day(int y, int m, int d){
		this.y=y;
		this.m=m;
		this.d=d;
	}
	public boolean Check(){
		if(y<=0){
			return false;
		}
		if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d>0&&d<32))
			return true;
		else if((m==4||m==6||m==9||m==11)&&(d>0&&d<31))
			return true;
		else if(m==2&&d>0){
			if(((y%400==0) || (y%4==0&&y%100!=0)) && d<=29)
				return true;
			else if(d<=28)
				return true;
		}
		return false;
	}
}