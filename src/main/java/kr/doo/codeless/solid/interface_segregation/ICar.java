package kr.doo.codeless.solid.interface_segregation;

public interface ICar {

    void drive();
    void turnLeft();
    void turnRight();

}

class Genesis implements ICar {

    @Override
    public void drive() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}

class Avante implements ICar {

    @Override
    public void drive() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}