/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.arrays.models;

/**
 *
 * @author jvidal
 */
@FunctionalInterface
public interface IMapFunction<T, K> {

    K run(T element, int index, T[] array);
}
