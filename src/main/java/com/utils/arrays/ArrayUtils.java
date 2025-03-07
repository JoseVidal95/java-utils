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
    public <T> List<T> zip(T[]... arrays) {
        int count = 0;
        for (T[] array : arrays) {
            count += array.length;
        }

        List<T> zipped = new ArrayList(count);

        int currentIdx = 0;
        for (T[] array : arrays) {
            if (array.length > 0) {
                if (currentIdx > 0 && currentIdx < array.length) {
                    zipped.add(array[currentIdx]);
                }
            }
        }

        return zipped;
    }

}
