package kr.doo.codeless.solid.single_responsibility;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@ToString
public class Cat {

    private String age;

    private String name;

    public void eat(String food) {

    }

    public void walk() {

    }

    public void speak() {

    }

    public String representation() {
        return String.format("age: %s name: %s", this.age, this.name);
    }

}

