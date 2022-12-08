package kr.doo.codeless.solid.open_closed;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
    String speak() {
        return null;
    }
}

class Cat extends Animal {
    @Override
    String speak() {
        return "meow";
    }
}

class Dog extends Animal {
    @Override
    String speak() {
        return "bark";
    }
}

class Sheep extends Animal {
    @Override
    String speak() {
        return "meh";
    }
}

class Cow extends Animal {
    @Override
    String speak() {
        return "moo";
    }
}