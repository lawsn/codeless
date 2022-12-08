package kr.doo.codeless.solid.single_responsibility;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CatTest {

    @Test
    public void testRepresentation() {
        Cat kitty = new Cat("10", "kitty");
        log.debug(kitty.toString());
    }
}
