package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-22
 * 16:31
 */
public interface USB {
    //安装驱动
    public abstract void setup();
    //进行工作
    public abstract void work();
}
