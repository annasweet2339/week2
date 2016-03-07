public class array {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5};
		int i,total=0,average=0;
		for(i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		average=total/i;
		System.out.println("Total:"+total+"\nAverage:"+average);
		System.exit(0);
    }
}