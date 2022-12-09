package kr.doo.codeless.solid.dependency_inversion;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ZooTest {

    @Test
    public void testZoo() {

        Zoo zoo = new Zoo();

        zoo.addAnimal(new Cat());
        zoo.addAnimal(new Dog());

        zoo.speakAll();

    }
}
