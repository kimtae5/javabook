package ch7;
import java.text.SimpleDateFormat;
import java.util.Date;

class ImportEx {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy--mm--dd");
		SimpleDateFormat time = new SimpleDateFormat("hh/:mm/:ss a");
		
		System.out.println("오늘 날짜 " + date.format(today));
		System.out.println("현재 시간 " + time.format(today));
	}
}
