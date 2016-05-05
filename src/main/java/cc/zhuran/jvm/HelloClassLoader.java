package cc.zhuran.jvm;

import cc.zhuran.jvm.some.path.to.Hello;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class HelloClassLoader {
    public static void main(String[] args) throws IOException {
        Enumeration<URL> resources = ClassLoader.getSystemResources("/cc/zhuran/jvm/some/path/to/Hello.class");
        while (resources.hasMoreElements()) {
            System.out.println("URL: " + resources.nextElement());
        }
        Hello.main(null);
    }
}
