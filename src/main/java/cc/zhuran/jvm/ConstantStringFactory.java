package cc.zhuran.jvm;

import java.util.ArrayList;
import java.util.List;

public class ConstantStringFactory {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        long base = 1000000000;
        heapCheck();
        for (int n=0; n<1000; n++) {
            for (int i=0; i<10*1024; i++) {
                StringBuffer tmp = new StringBuffer();
                for (int k=0; k<16; k++)
                    tmp.append("String"+(base+n)+"String"+(base+i));
                buffer.add((tmp.toString()).intern());
            }
            System.out.println((n+1)+": "
                    +(n+1)*10+" MB of strings created.");
            heapCheck();
        }
    }
    public static void heapCheck() {

        Runtime rt = Runtime.getRuntime();
        rt.gc();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        long used = total - free;
        java.io.Console con = System.console();
        con.format("Total memory: %s%n",total);
        con.format(" Free memory: %s%n",free);
        con.format(" Used memory: %s%n",used);
        String str = con.readLine("Press ENTER key to continue: ");
    }

}
