import java.io.*;
import java.util.Scanner;
abstract class Shape 
{
	abstract double area();
}
class Circle extends Shape 
{
	double r;
	public Circle(double r) 
	{
		this.r = r;
	}
	public double area() 
	{
		return 3.14 * r * r;
	}
}
class Oval extends Shape 
{
	double l,s;
	public Oval(double l, double s) 
	{
		this.l = l;
		this.s = s;
	}
	public double area() 
	{
		
		return 3.14 * 2 * s + 4 * (l - s);
		
	}
}
class Rect extends Shape 
{
	double l,s;
	public Rect(double l, double s) 
	{
		this.l = l;
		this.s = s;
	}
	public double area() 
	{
		return l * s;
	}
}
class Tri extends Shape 
{
	double l,s;
	public Tri(double l, double s) 
	{
		this.l = l;
		this.s = s;
	}
	public double area() 
	{
		return (l * s) / 2;
	}
}
class CORT
{
	public static void main(String[] args)
	{
		int sharp[] = new int[10];
		Circle circle[] = new Circle[10];
		Oval oval[] = new Oval[10];
		Rect rect[] = new Rect[10];
		Tri tri[] = new Tri[10];
		
        Scanner enter = new Scanner(System.in);
        double num1= 0,num2 = 0;
		double area = 0;
        int c1= 0,c2=0,c3=0,c4=0,count = 0,option,a;
		while(true)
		{
			System.out.printf("1)正圓 2)橢圓 3)矩形 4)三角型 -1)結束並顯示全部 :");
			option = enter.nextInt();
			sharp[count] = option;
			count++;
			if(option == 1)
			{
				System.out.printf("半徑:");
				num1 = enter.nextInt();
				circle[c1] = new Circle(num1);
				c1++;
			}
			else if(option == 2)
			{
				System.out.printf("長軸:");
				num1 = enter.nextDouble();
				System.out.printf("短軸:");
				num2 = enter.nextDouble();
				oval[c2] = new Oval(num1,num2);
				c2++;
			}
			else if(option == 3)
			{
				System.out.printf("長:");
				num1 = enter.nextDouble();
				System.out.printf("寬:");
				num2 = enter.nextDouble();
				rect[c3] = new Rect(num1,num2);
				c3++;
			}
			else if(option == 4)
			{
				System.out.printf("底:");
				num1 = enter.nextDouble();
				System.out.printf("高:");
				num2 = enter.nextDouble();
				tri[c4] = new Tri(num1,num2);
				c4++;
			}
			else if(option == -1)
			{
				c1= 0;c2=0;c3=0;c4=0;
				for(int i=0;i<count;i++)
				{
					if(sharp[i]==1)
					{
						System.out.println((i+1)+"圓形面積:"+circle[c1].area());
						c1++;
					}
					else if(sharp[i]==2)
					{
						System.out.println((i+1)+"橢圓面積為:"+oval[c2].area());
						c2++;
					}
					else if(sharp[i]==3)
					{
						System.out.println((i+1)+"矩形面積為:"+rect[c3].area());
						c3++;
					}
					else if(sharp[i]==4)
					{
						System.out.println((i+1)+"三角形面積為:"+tri[c4].area());
						c4++;
					}
				}
				break;
			}
			else{
				System.out.println("錯誤!");
			}		
		}	      
	}
}
