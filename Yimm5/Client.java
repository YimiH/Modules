package com.Yimm5;

/**
 * Author: sy
 * Create:2019-03-23
 * 13:51
 */
public class Client {

    public void buyComputer(Computer computer){
        computer.PrintComputer();
    }

    public void useOSystem(OSystem system){
        system.printOSystem();
    }

    public static void main(String[] args) {
        Client client=new Client();
        /*Computer computer=new MacFactory().createComputer();
        OSystem system=new MacFactory().createSystem();*/
        ProductFactory factory=new MacFactory();
        Computer computer=factory.createComputer();
        OSystem system=factory.createSystem();
        client.buyComputer(computer);
        client.useOSystem(system);
    }

}
