package chapter10;

public class Chapter10_01 {

	public static void main(String[] args) {
		
		Time firstTime = new Time();
		Time secondTime = new Time(555550000);
		
		System.out.println(firstTime.getHour() + ":" + firstTime.getMinute() + ":" + firstTime.getSecond());
		System.out.println(secondTime.getHour() + ":" + secondTime.getMinute() + ":" + secondTime.getSecond());

	}

}
