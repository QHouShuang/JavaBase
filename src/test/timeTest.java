package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timeTest {

	public static void main(String[] args) {
		Date nowTime = new Date(System.currentTimeMillis());
		SimpleDateFormat sdFormatter = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		System.out.println(retStrFormatNowDate);

		Timer time = new Timer();
		// 一般匿名内部类，第二个参数是要设定延迟的时间，第三个参
		// 数是周期的设定，每隔多长时间执行该操作
		time.schedule(new TimerTask() {
			@Override
			public void run() {
				Date date = new Date();
				SimpleDateFormat sf = new SimpleDateFormat(
						"yyyy年MM月dd日 HH时mm分ss秒");
				String day = sf.format(date);
				System.out.println(day);
			}
		}, 0, 1000);
	}
}
