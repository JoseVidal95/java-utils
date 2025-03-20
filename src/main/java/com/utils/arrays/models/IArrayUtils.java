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

    <T> List<T> concatenate(T[]... arrays);

    <T, K> K reduce(T[] array, K initial, IReducerFunction<T, K> callback);

    <T, K> List<K> map(T[] array, IMapFunction<T, K> callback);

    <T> List<T> zip(T[]... arrays);
}
