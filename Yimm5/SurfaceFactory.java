package com.Yimm5;

/**
 * Author: sy
 * Create:2019-03-23
 * 13:43
 */
public class SurfaceFactory implements ProductFactory {

    public Computer createComputer() {
        return new SurfaceComputer();
    }

    public OSystem createSystem() {
        return new WindowsSystem();
    }
}
