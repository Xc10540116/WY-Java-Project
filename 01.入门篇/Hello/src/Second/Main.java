package Second;

import java.util.Scanner;

/*public class Main {
 
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner in = new Scanner(System.in);
        int BJT = in.nextInt();
        int UTC;
        int miao = BJT%10;
        BJT/=10;
        int fen = BJT%10;
        if(fen <=5){
        	BJT/=10;
            int hour = BJT%100;
            int newhour;
            if(hour <=23){
            	if(hour >=8)
        			newhour = hour - 8;
        		else
        			newhour = hour + 24 - 8;
        		UTC=Integer.parseInt(newhour+""+fen+""+miao);
                System.out.println(UTC);
            }
        }
    }
}*/

/*public class Main {
	
	public static void main(String[] args) {
		int bjt;
		int utc;
		Scanner in = new Scanner(System.in);
		bjt = in.nextInt();
		if(bjt>0 && bjt<2359){
			int hour = bjt / 100;
			if(hour < 8)
				hour = hour + 24 - 8;
			else
				hour = hour - 8;
			int tens = (bjt/10)%10;
			if(tens <=5) {
				int minute = bjt % 100;
				String newminute;
				if(tens == 0){
					newminute = "0" + minute;
				}else
					newminute = "" + minute;
				utc = Integer.parseInt(hour + newminute);
				System.out.println(utc);
			}
		}
	}
}*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			int bjt = in.nextInt();
			int utc;
			int g = bjt %10;
			bjt/=10;
			int s = bjt %10;
			bjt/=10;
			int hour = bjt %100;
			System.out.println(hour);
			System.out.println(s);
			System.out.println(g);
			if(hour < 24 && hour >= 0){
				int newhour;
				if(hour >=8)
					newhour = hour - 8;
				else
					newhour = hour + 24 - 8;
				if(s < 6) {
					String newminute = s + "" + g;
					utc = Integer.parseInt(newhour + newminute);
					System.out.println(utc);
				}
			}
		} catch(Exception e) {
			System.out.println("this not a number");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			int bjt = in.nextInt();
			int utc;
			int hour = bjt / 100;
			System.out.println(hour);
			int minute = bjt % 100;
			System.out.println(minute);
			if(hour < 24 && hour > 0){
				int newhour;
				if(hour >=8)
					newhour = hour - 8;
				else
					newhour = hour + 24 - 8;
				if(minute < 60) {
					String newminute = Integer.toString(minute);
					if(minute < 10)
						newminute = "0" + minute;
					utc = Integer.parseInt(newhour + newminute);
					System.out.println(utc);
				}
			}
		} catch(Exception e) {
			System.out.println("this not a number");
		}
	}
}
