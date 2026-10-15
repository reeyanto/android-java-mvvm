package com.riyanto.mycounterapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<Integer> counter = new MutableLiveData<>(0);

    public LiveData<Integer> getCounter() {
        return counter;
    }

    public void increment() {
        if (counter.getValue() != null) {
            counter.setValue(counter.getValue() + 1);
        }
    }
}
