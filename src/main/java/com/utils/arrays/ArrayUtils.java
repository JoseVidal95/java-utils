/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jvidal
 */
public class ArrayUtils implements IArrayUtils {

    @Override
    public <T> T[] zip(T[]... arrays) {
        int count = 0;
        for (T[] array : arrays) {
            count += array.length;
        }

        List<T> zipped = new ArrayList(count);

        int currentIdx = 0;
        for (T[] array : arrays) {
            if (array.length > 0 && currentIdx > 0 && currentIdx < array.length) {
                zipped.add(array[currentIdx]);
            }
        }

        return (T[]) zipped.toArray();
    }

    @Override
    public <T> List<T> zip(List<T>... arrays) {
        int count = 0;
        for (List<T> array : arrays) {
            count += array.size();
        }

        List<T> zipped = new ArrayList(count);

        int currentIdx = 0;
        for (List<T> array : arrays) {
            if (!array.isEmpty() && currentIdx > 0 && currentIdx < array.size()) {
                zipped.add(array.get(currentIdx));
            }
        }

        return zipped;
    }

    @Override
    public <T> boolean equals(List<T> a1, List<T> a2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> boolean equals(T[] a1, T[] a2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
