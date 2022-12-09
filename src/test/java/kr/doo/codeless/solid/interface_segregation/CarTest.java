package kr.doo.codeless.solid.interface_segregation;

import org.junit.Test;

public class CarTest {

    @Test
    public void testICar() {
        ICar nocopeCar = new Genesis();
        ICar secondCar = new Avante();
    }
}
