/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.events;

import com.utils.events.models.IEventHost;
import com.utils.events.models.IObserver;
import com.utils.logs.LogContext;
import com.utils.logs.models.ILogService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jvidal
 */
public abstract class EventHost<T> implements IEventHost<T> {

    private final Map<String, List<IObserver>> observers = new HashMap();
    protected ILogService logger;

    @Override
    public void suscribe(String event, final IObserver observer) {
        List<IObserver> _observers = this.getOrCreateObservers(event);
        _observers.add(observer);
        this.observers.put(event, _observers);
    }

    @Override
    public void unsuscribe(String event, IObserver observer) {
        if (this.observers.containsKey(event)) {
            List<IObserver> _observers = this.observers.get(event);
            _observers.remove(observer);
        }
    }

    @Override
    public void emit(String event, T arg) {
        if (this.observers.containsKey(event)) {
            List<IObserver> _observers = this.observers.get(event);
            _observers.forEach(_obs -> this.emit(event, _obs, arg));
        }
    }

    @Override
    public void emit(String event) {
        if (this.observers.containsKey(event)) {
            List<IObserver> _observers = this.observers.get(event);
            _observers.forEach(_obs -> this.emit(event, _obs));
        }
    }

    private void emit(String event, IObserver observer, T arg) {
        this.log(event, arg);
        observer.update(arg);
    }

    private void emit(String event, IObserver observer) {
        this.log(event, (T) "void");
        observer.update();
    }

    private List<IObserver> getOrCreateObservers(String event) {
        if (this.observers.containsKey(event)) {
            return this.observers.get(event);
        }

        return new ArrayList();
    }

    private void log(String event, T arg) {
        if (this.logger != null) {
            this.logger.info(LogContext.EVENT, "Emitted event: " + event + "\nArgs: " + arg.toString());
        }
    }

}
