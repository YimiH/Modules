package com.Yimm6;

/**
 * Author: sy
 * Create:2019-03-23
 * 17:20
 */

//真实主题类，真正要买电脑的对象
public class RealSubject implements ISubject {
    public void buyComputer() {
        System.out.println("买电脑,付钱");
    }
}
