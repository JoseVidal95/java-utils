/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.events;

/**
 *
 * @author jvidal
 */
public interface IEventSubject<T> {

    void suscribe(String event, IObserver observer);

    void unsuscribe(String event, IObserver observer);

    void emit(String event, T arg);
}
