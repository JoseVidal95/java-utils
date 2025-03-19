/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.arrays.models;

/**
 *
 * @author jvidal
 */
public interface IReducerFunction<T, K> {

    K run(T element, K current, int index, T[] array);
}
