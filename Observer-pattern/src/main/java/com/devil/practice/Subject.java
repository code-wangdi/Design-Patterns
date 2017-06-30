package com.devil.practice;

/**
 * Created by wangdi on 2017/6/30.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
