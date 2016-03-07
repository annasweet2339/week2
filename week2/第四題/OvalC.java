import java.io.*;
import java.util.Scanner;
class Circle 
{
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
}
class Oval extends Circle
{
    double shortedge;
    public Oval(double longedge,double shortedge) 
	{
        super(longedge);
        this.shortedge = shortedge;
    }
    double area() 
	{
		return 3.14*r*shortedge;
    }
    double length()
    {
		if(r > shortedge)
		{
			return 4*(r - shortedge)+3.14*2*shortedge ;
		}
		else if(shortedge > r)
		{
			return  4*(shortedge - r)+3.14*2*r ;
		}
		else
		{
			return 2*3.14*r;
		}
        
    }
}
class OvalC
{
	public static void main(String[] args)
	{
		Scanner op = new Scanner(System.in);
		Oval oval[] = new Oval[3];
        double longedge,shortedge;
        int num;
		
		for(int i=0;i<3;i++){
			System.out.printf("橢圓"+(i+1)+"長軸:");
					longedge= op.nextDouble();
					System.out.printf("橢圓"+(i+1)+"短軸:");
					shortedge = op.nextDouble();
					if(longedge<= 0 || shortedge <= 0)
					{
						System.out.println("錯誤!");
					}
					else
					{
						oval[i] = new Oval(longedge,shortedge);
					}
		}
		while(true){
			System.out.printf("編號:(-1結束)");
				num = op.nextInt();
				if(num > 3 || num < -1 || num==0 )
				{
					System.out.println("錯誤!!!");
				}
				else if(num!=-1)
				{
					System.out.println("橢圓面積:" + oval[num - 1].area());
					System.out.println("橢圓邊長:" + oval[num - 1].length());
				}	
				else
					break;
			}
			      
	}
}
