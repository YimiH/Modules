package com.Yimm5;

/**
 * Author: sy
 * Create:2019-03-23
 * 13:40
 */


//电脑工厂，产生电脑实例化对象方法
public interface ProductFactory {
    Computer createComputer();
    OSystem createSystem();
}
