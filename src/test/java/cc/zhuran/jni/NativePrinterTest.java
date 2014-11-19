package cc.zhuran.jni;

import org.junit.Before;
import org.junit.Test;

public class NativePrinterTest {

	private NativePrinter printer;

	@Before
	public void before(){
		printer = new NativePrinter();
	}

	@Test
	public void testPrinter(){
		printer.print("test message");
	}
}
