package com.Yimm3;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:51
 */

//简单工厂设计模式
public class ComputerFactory {
    public static Computer getInstance(String type){
        type.toUpperCase();
        if(type.equals("Macbook")){
            return new MacbookComputer();
        }
        else if(type.equals("Surface")){
            return new SurfaceComputer();
        }
        else{
            System.out.println("对不起，您选择的产品目前缺货");
            return null;
        }
    }
}
