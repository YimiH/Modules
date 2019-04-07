package com.Yimm4;

/**
 * Author: sy
 * Create:2019-03-22
 * 17:30
 */
public class SurfaceFactory implements ComputerFactory {
    public Computer createComputer() {
        return new SurfaceComputer();
    }
}
