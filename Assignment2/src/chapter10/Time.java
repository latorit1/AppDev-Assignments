package chapter10;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private long Time;
	
	public Time() {
		Time = System.currentTimeMillis();
	}
	
	public Time(long time) {
		this.Time = time;
	}
	
	public Time(int hr, int min, int sec) {
		this.hour = hr;
		this.minute = min;
		this.second = sec;
	}
	
	public void setTime(long elapseTime) {
		this.Time = elapseTime;
	}
	
	public int getHour() {
		return (int) (Time/(1000*60*60) % 24);
	}
	
	public int getMinute() {
		return (int) (Time/(1000*60) % 60);
	}
	
	public int getSecond() {
		return (int) (Time/(1000) % 60);
	}
	
	
}
