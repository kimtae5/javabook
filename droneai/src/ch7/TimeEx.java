package ch7;

class TimeEx {
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		
		t.setHour(t.getHour()+1);
		System.out.println(t);
		
		t.setHour(17); // 잘못된 값 → 무시됨
		t.setMinute(10);
		t.setSecond(99);
		System.out.println(t);
		
//		t.hour = 13;
	}
}

class Time {
    private int hour;   // 시
    private int minute; // 분
    private int second; // 초

    // 생성자
    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Getter & Setter
    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return; // 유효성 검사
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
        	System.out.println("worng number!! change now second");
        	return;
        }
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

