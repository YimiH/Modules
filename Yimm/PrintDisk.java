package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:36
 */
public class PrintDisk implements USB {

    public void setup() {
        System.out.println("安装打印机驱动");
    }

    public void work() {
        System.out.println("打印机工作");
    }
}
