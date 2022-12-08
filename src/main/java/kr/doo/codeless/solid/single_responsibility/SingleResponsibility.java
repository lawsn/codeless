package kr.doo.codeless.solid.single_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleResponsibility {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void numPrint(int num) {
      log.debug(String.valueOf(num));
    }
}
