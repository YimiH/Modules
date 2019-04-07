package com.Yimm5;

/**
 * Author: sy
 * Create:2019-03-23
 * 13:42
 */
public class MacFactory implements ProductFactory {

    public Computer createComputer() {
        return new MacComputer();
    }

    public OSystem createSystem() {
        return new MaOXSystem();
    }
}
