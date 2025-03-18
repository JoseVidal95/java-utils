/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.utils.constants;

/**
 *
 * @author jvidal
 */
public enum LogContext implements ILogContextEnum {
    EVENT("event"),
    SERVICE("service");

    private final String value;

    private LogContext(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

}
