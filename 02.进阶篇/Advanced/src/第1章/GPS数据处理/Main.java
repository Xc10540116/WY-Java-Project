package 第1章.GPS数据处理;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		String result = "";
		while(!"END".equals(in)){
			int begin = in.indexOf("$GPRMC");
			if(begin >= 0){
				int end = in.indexOf("*", begin);
				if(end >= 0){
					String n = in.substring(end+1, (end+3));
					String s = in.substring(begin, end);
					char[] a = s.toCharArray();
					int r = 0;
					char left;
					char right;
					for(int i=2; i<a.length; i++){
						if(i==2){
							left = s.charAt(i-1);
							right = s.charAt(i);
							r = left^right;
						} else {
							right = s.charAt(i);
							r = r^right;
						}
					}
//					System.out.println(Integer.toHexString(r));
					if(r == Integer.parseInt(n, 16)){
						String[] c = s.split(",");
						if(c.length == 13){
							if(c[2].equals("A")){
								int time = (int)Math.floor(Double.parseDouble(c[1]));
								Double jd = Double.parseDouble(c[5]);
								String jdbq = c[6];
								int qj = (int)Math.round(jd/1500);
								int ss = time % 100;
								time = time/100;
								int minute = time % 100;
								time = time/100;
								int hour = time %100;
								if(jdbq.equals("E")){
									if(hour + qj >= 24)
										hour = hour + 8 - 24;
									else
										hour = hour + 8;
								} else {
									if(hour - qj <= 0)
										hour = hour - 8 + 24;
									else
										hour = hour - 8;
								}
									
								result = (hour < 10 ? "0" + hour : hour) + ":";
								result += (minute < 10 ? "0" + minute : minute) + ":";
								result += (ss < 10 ? "0" + ss : ss);
							}
						}
					}
				}
			}
			in = scanner.nextLine();
		}
		System.out.println(result);
		scanner.close();
	}

}
