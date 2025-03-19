/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.logs.models;

/**
 *
 * @author jvidal
 */
public interface ILogAdapter {

    void info(String message);

    void warn(String message);

    void error(String message);
}
