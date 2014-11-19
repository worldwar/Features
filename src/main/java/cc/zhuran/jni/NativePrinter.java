package cc.zhuran.jni;

public class NativePrinter {
	static {
//		System.loadLibrary("CYGWIN1");
//		System.loadLibrary("CYGGCC_S-1");
//		System.loadLibrary("CYGSTDC++-6");
		System.loadLibrary("NativePrinter");
	}
	public native void print(Object object);
}