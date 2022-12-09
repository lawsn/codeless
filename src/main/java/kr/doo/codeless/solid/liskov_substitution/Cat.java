package kr.doo.codeless.solid.liskov_substitution;

public class Cat {

    public String speak() {
        return "meow";
    }
}

class BlackCat extends Cat {

    public String speak() {
        return "black meow";
    }
}