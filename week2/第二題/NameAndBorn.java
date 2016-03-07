class Circle {
 double r;
 double area(double r) {
 return 3.14 * r * r;
 }
 double arc(double a,double r) {
 return 3.14 *(a/360)*(r*2);
 }
 double pie(double a,double r) {
 return 3.14 * r * r* (a/360);
 }
 
 public static void main(String[] args) {
	Scanner op = new Scanner(System.in);
	Circle c = new Circle();
	double arr1[]=new double[3];
	for(int i=0;i<3;i++)
	{
		System.out.println("輸入半徑"+(1+i));
		arr1[i]=op.nextDouble;
	}
	while(true)
	{
		System.out.println("輸入圓形編號 (-1結束)");
		int option=op.nextDouble;
		if(option != -1)
		{
			System.out.println("輸入角度");
			double angle=op.nextDouble;
			System.out.println("弧長:"+arc(angle,arr[option-1]));
			System.out.println("\n面積:"+pie(angle,arr[option-1]));
		}
		else
			break;
	}
 }
}