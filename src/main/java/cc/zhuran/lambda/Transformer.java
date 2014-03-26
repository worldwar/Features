package cc.zhuran.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Transformer {
	public static <T, R> List<R> transform(List<T> numbers, Function<T, R> function) {
		return numbers.stream().map(function).collect(Collectors.toList());
	}
}
