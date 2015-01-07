package cc.zhuran;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringsTest {
    @Test
    public void shouldGetMaxSame() {
        assertThat(Strings.maxSame("aaBBBcC"), is("BBB"));
        assertThat(Strings.maxSame("aaBBBcCcc"), is("BBB"));
        assertThat(Strings.maxSame("aaBBBcCccc"), is("BBB"));
        assertThat(Strings.maxSame("aaBBBcCcccc"), is("cccc"));
    }

    @Test
    public void shouldGetMaxIncrement() {
        assertThat(Strings.maxIncrement("134297381"), is("134"));
    }

}