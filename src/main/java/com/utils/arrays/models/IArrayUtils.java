/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.arrays.models;

import java.util.List;

/**
 *
 * @author jvidal
 */
public interface IArrayUtils {

    <T, K> K reduce(T[] array, K initial, IReducerFunction<T, K> callback);

    <T, K> List<K> map(T[] array, IMapFunction<T, K> callback);

    <T> List<T> zip(List<T>... arrays);

    <T> T[] zip(T[]... arrays);

    <T> boolean equals(List<T> a1, List<T> a2);

    <T> boolean equals(T[] a1, T[] a2);
}
