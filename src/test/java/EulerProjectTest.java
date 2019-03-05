import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class EulerProjectTest {

    @Test
    public void shouldReturn10For10() {

        //given
        EulerProject eulerProject = new EulerProject();
        // when
        int result = eulerProject.zadanie1(10);
        //then
        assertThat(result, is(10));

    }

    @Test
    public void shouldReturn144For34() {
        //given
        EulerProject eulerProject = new EulerProject();
        // when
        int result = eulerProject.zadanie1(34);
        //then
        assertThat(result, is(44));
    }

    @Test
    public void shouldReturn188For144() {

        //given
        EulerProject eulerProject = new EulerProject();
        // when
        int result = eulerProject.zadanie1(144);
        //then
        assertThat(result, is(188));

    }

}