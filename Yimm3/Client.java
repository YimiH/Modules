package com.Yimm3;

import java.util.Scanner;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:52
 */

//简单工厂设计模式
public class Client {
    public void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Client cilent=new Client();
        System.out.println("请输入您需要购买的电脑型号");
        Scanner scan=new Scanner(System.in);
        String type=scan.next();
        Computer computer=new ComputerFactory().getInstance(type);
        cilent.buyComputer(computer);
    }
}
