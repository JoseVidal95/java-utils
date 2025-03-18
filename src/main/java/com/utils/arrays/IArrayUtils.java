/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.arrays;

import java.util.List;

/**
 *
 * @author jvidal
 */
public interface IArrayUtils {

    <T> List<T> zip(List<T>... arrays);

    <T> T[] zip(T[]... arrays);

    <T> boolean equals(List<T> a1, List<T> a2);

    <T> boolean equals(T[] a1, T[] a2);
}
