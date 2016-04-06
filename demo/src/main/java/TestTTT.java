import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestTTT {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		new TestTTT().test();
	}
	
	
	@Test
	public void test(){
		System.out.println("this is test start");
		this.logger.debug("logtest");
		System.out.println("this is test end");
	}

}
