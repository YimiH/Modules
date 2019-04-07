package com.Yimm4;

/**
 * Author: sy
 * Create:2019-03-22
 * 17:28
 */
public class MacbookFactory implements ComputerFactory {
    public Computer createComputer() {
        return new MacbookComputer();
    }
}
