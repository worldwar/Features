package cc.zhuran.jni;

import java.awt.*;

public class Application {
	public static void main(String[] args){
		NativePrinter printer = new NativePrinter();
		printer.print(Color.BLACK);
	}
}