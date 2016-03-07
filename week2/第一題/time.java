public class time {
    public static void main(String[] args){
        int hour1=4,min1=23,sec1=45;
		int hour2=13,min2=54,sec2=23;
		int time1=hour1*360+min1*60+sec1;
		int time2=hour2*360+min2*60+sec2;
		int time = time2-time1;
		System.out.println("A11 seconds:"+time);
		System.exit(0);
    }
}