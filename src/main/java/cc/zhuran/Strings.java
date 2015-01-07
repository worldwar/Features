package cc.zhuran;

public class Strings {
    public static void main(String[] args) {
        System.out.println(maxIncrement("134297381").equals("134"));
        System.out.println(maxSame("aaBBBcC").equals("BBB"));
        System.out.println(maxSame("011011100").equals("111"));

    }

    public static String maxSame(String origin) {
        return max(origin, new SamePartialStrategy());
    }

    public static String maxIncrement(String origin) {
        return max(origin, new IncrementPartialStrategy());
    }

    public static String max(String origin, PartialStrategy strategy) {
        String result = "";
        int index = 0;
        while (index < origin.length()) {
            String part = strategy.partial(index, origin);
            index += part.length();
            if (part.length() > result.length()) {
                result = part;
            }
        }
        return result;
    }
}
