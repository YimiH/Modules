package com.Yimm6;

/**
 * Author: sy
 * Create:2019-03-23
 * 17:22
 */

//辅助业务类,代理类需要传入一个真实用户

public class ProxySubject implements ISubject {

    //
    private ISubject realSubject;
    //利用构造方法传入真实对象，代理类需要知道真实对象是谁
    public ProxySubject(ISubject realSubject){
        this.realSubject=realSubject;
    }

    public void beforeBuy(){
        System.out.println("");
    }

    public void buyComputer() {

    }
}
