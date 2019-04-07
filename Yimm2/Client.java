package com.Yimm2;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:45
 */
public class Client {

    public void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
         Client client=new Client();
         client.buyComputer(new SurComputer());
    }

}
