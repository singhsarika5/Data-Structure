import static org.junit.Assert.*;
import org.junit.Test;

public class MessageUtilTest {

	String message="Hello World";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(message, msgUtil.printMessage());
	}

}
