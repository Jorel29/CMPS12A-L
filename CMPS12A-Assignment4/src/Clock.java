
public class Clock {
	private int hour;
	private int minute;
	
	public Clock() {
		hour = 0;
		minute = 0;
	}
	public Clock(int h) {
		hour = h;
		minute = 0;
		
	}
	public Clock(int h, int m) {
		hour = h;
		minute = m;
		
	}
	
	public int getHour(){
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void incrementTimer() {
		minute++;
		if (minute == 60) {
			hour++;
			minute = 0;
		}
		if (hour > 24) {
			hour = 1;
		}
	}
	public void incrementTimer(int x) {
		for (int i = 0;i < x; i++) {
			incrementTimer();
		}
		
	}
	public void setTime(int h, int m) {
		if ( h <= 24 && m < 60) {
			hour = h;
			minute = m;
		} else {
			System.out.println("Invalid Input");
		}
	}
	public String toString() {
		String time ="";
		if (hour > 12 && hour < 22) {
			if (minute < 10) {
				time = "0" + (hour-12) + ":0" + minute +" PM";
			}else {
				time = "0" + (hour-12) + ":" + minute + " PM";
			}
		}else if (hour > 22) {
			if (minute < 10) {
				time = hour + ":0" + minute +" PM";
			} else {
				time = hour + ":" + minute + " PM";
			}
		}else if (hour == 24 || hour == 0) {
			if (minute < 10) {
				time = "12:" + "0" + minute + " AM"; 
			}else {
				time =  "12:" + minute + " AM";
			}
		}else if (hour < 10) {
			if (minute < 10) {
				time = "0" + hour + ":0" + minute + " AM";
			}else {
				time = "0" + hour + ":" + minute + " AM";
			}
		}else if (hour > 10 && hour < 12) {
			if (minute < 10) {
				time = hour + ":0" + minute +" AM";
			}else {
				time = hour + ":" + minute + " AM";
			}
		} else if (hour == 12) {
			if (minute < 10) {
				time = hour + ":0" + minute + " PM";
			}else {
				time = hour + ":" + minute + " PM";
			}
		}
		return time;
	}
	

}
