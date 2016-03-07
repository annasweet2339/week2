import java.util.*;
class StudentNameScoreNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] name=new String[5];
		int[] grade=new int[5];
		for(int i=1;i<=5;i++){
			System.out.print("學生"+i+"\t姓名:");
			name[i-1]=new String(input.next());
			while(true){
				System.out.print("學生"+i+"\t成績:");
				
				try{
					grade[i-1]=input.nextInt();
						if(grade[i-1]<0 || grade[i-1]>100){
							System.out.println("成績輸入錯誤!");
						}
						else 
							break;
				}catch(Exception e){
					System.out.println("成績輸入錯誤!");
					input.next();
				}
			}
		}
		try{
			System.out.print("查詢:輸入學生編號:");
			int num=input.nextInt();
			if(num>=1&&num<=5){
				System.out.println("查詢結果:編號"+num+" 姓名"+name[num-1]+" 成績"+grade[num-1]);
			}
			else{
				System.out.println("查無編號");
			}
		}catch(Exception e){
			System.out.println("輸入錯誤");
		}
	}
}