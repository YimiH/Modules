package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:37
 */
public class Test {
    public static void main(String[] args) {
        /*UDisk ud=new UDisk();
        ud.setup();
        ud.work();
        System.out.println("*******************");
        PrintDisk pd=new PrintDisk();
        pd.setup();
        pd.work();*/

        Computer com=new Computer();
        com.plugin(new UDisk());
        com.plugin(new PrintDisk());
    }
}
