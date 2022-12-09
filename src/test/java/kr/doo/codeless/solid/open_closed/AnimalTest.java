package kr.doo.codeless.solid.open_closed;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class AnimalTest {

    @Test
    public void testSpeak() {
        Animal kitty = new Cat();
        Animal bingo = new Dog();

        assertEquals("meow", kitty.speak());
        assertEquals("bark", bingo.speak());
    }
}
