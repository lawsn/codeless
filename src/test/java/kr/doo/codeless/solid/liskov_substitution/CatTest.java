package kr.doo.codeless.solid.liskov_substitution;

import lombok.extern.slf4j.Slf4j;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

@Slf4j
public class CatTest {

    @Test
    public void testCat() {
        Cat cat = new Cat();
        assertEquals("meow", cat.speak());

        cat = new BlackCat();
        assertEquals("black meow", cat.speak());
    }



}
