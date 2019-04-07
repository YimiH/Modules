package com.Yimm4;

/**
 * Author: sy
 * Create:2019-03-22
 * 17:33
 */
public class Client {
    public static  void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Client client=new Client();
        ComputerFactory comfac=new MacbookFactory();
        Computer computer=comfac.createComputer();
        computer.printComputer();
    }
}
