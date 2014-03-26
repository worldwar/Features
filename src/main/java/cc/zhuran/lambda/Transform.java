package cc.zhuran.lambda;

@FunctionalInterface
public interface Transform<T, R> {
	public abstract R apply(T x);
}
