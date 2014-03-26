import cc.zhuran.lambda.Transformer;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.function.Function;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransformerTest {

	@Test
	public void shouldDoubleEveryElementInCollection(){
		List<Integer> numbers = Lists.newArrayList(1, 2, 3, 4);
		List<Integer> results = Transformer.transform(numbers, x -> x * 2);
		assertThat(results.get(0), is(2));
	}

	@Test
	public void shouldDuplicateEveryElementInCollectionForStrings(){
		List<String> strings = Lists.newArrayList("1", "2", "3", "4");
		List<String> results = Transformer.transform(strings, x -> x + x);
		assertThat(results.get(0), is("11"));
	}

	@Test
	public void shouldConvertEveryNumberInCollectionToString(){
		List<Integer> numbers = Lists.newArrayList(1, 2, 3, 4);
		List<String> results = Transformer.transform(numbers, String::valueOf);
		assertThat(results.get(0), is("1"));
	}

	@Test
	public void shouldDoubleEveryNumberInCollectionAndThenToString(){
		List<Integer> numbers = Lists.newArrayList(1, 2, 3, 4);
		List<String> results = Transformer.transform(numbers, ((Function<Integer, String>)s -> String.valueOf(s)).compose( s -> s * 2));
		assertThat(results.get(0), is("2"));
	}
}
