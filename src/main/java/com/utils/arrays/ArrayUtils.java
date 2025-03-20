/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.arrays;

import com.utils.arrays.models.IArrayUtils;
import com.utils.arrays.models.IMapFunction;
import com.utils.arrays.models.IReducerFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jvidal
 */
public class ArrayUtils implements IArrayUtils {

    @Override
    public <T> List<T> zip(T[]... arrays) {
        int count = this.reduce(arrays, 0, (T[] array, int current) -> current + array.length);

        List<T> zipped = new ArrayList(count);

        int currentIdx = 0;
        for (T[] array : arrays) {
            if (array.length > 0 && currentIdx > 0 && currentIdx < array.length) {
                zipped.add(array[currentIdx]);
            }
        }

        return zipped;
    }

    @Override
    public <T, K> List<K> map(T[] array, IMapFunction<T, K> callback) {
        List<K> mapped = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            mapped.add(callback.run(array[i], i, array));
        }

        return mapped;
    }

    @Override
    public <T, K> K reduce(T[] array, K initial, IReducerFunction<T, K> callback) {
        K value = initial;

        for (int i = 0; i < array.length; i++) {
            value = callback.run(array[i], value, i, array);
        }

        return value;
    }

    @Override
    public <T> List<T> concatenate(T[]... arrays) {
        int count = this.reduce(arrays, 0, (T[] array, int current) -> current + array.length);

        List<T> result = new ArrayList(count);

        for (T[] array : arrays) {
            result.addAll(Arrays.asList(array));
        }

        return result;
    }

}
