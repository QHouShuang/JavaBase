package test;
import org.junit.Test;
public class ThreadTest {

	@Test
	public void test() {
		new Thread(new Runnable() {
			public void run() {
				long t=System.currentTimeMillis();
				System.out.println(t);
			}
		}).start();
	}
	
}
