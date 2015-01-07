package cc.zhuran;

public class IncrementPartialStrategy implements PartialStrategy {
    @Override
    public String partial(int index, String origin) {
        if (index >= origin.length()) {
            return "";
        }
        char c = origin.charAt(index);
        StringBuilder result = new StringBuilder();
        result.append(c);
        for (int i = index + 1; i < origin.length() && origin.charAt(i) > c; i++) {
            result.append(origin.charAt(i));
            c = origin.charAt(i);
        }
        return result.toString();
    }
}
