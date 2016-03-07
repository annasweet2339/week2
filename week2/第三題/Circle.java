import java.util.*;
class Circle {
 double r;
 Circle(double r) {
		this.r = r;
	}
 double area() {
 return 3.14 * r * r;
 }
 double arc(double a) {
 return 3.14 *(a/360)*(r*2);
 }
 double pie(double a) {
 return area()* (a/360);
 }
 
 public static void main(String[] args) {
	Circle arr1[]=new Circle[3];
	Scanner op = new Scanner(System.in);
	//double arr1[]=new double[3];
	for(int i=0;i<3;i++)
	{
		System.out.println("輸入半徑"+(1+i));
		double b=op.nextDouble();
		arr1[i]=new Circle(b);
	}
	while(true)
	{
		System.out.println("輸入圓形編號 (-1結束)");
		int option=op.nextInt();
		if(option != -1)
		{
			System.out.println("輸入角度");
			double angle=op.nextDouble();
			System.out.println("弧長:"+arr1[option-1].arc(angle));
			System.out.println("\n面積:"+arr1[option-1].pie(angle));
		}
		else
			break;
	}
 }
}