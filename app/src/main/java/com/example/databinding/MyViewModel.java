package com.example.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number;


    public MutableLiveData<Integer> getNumber() {
        if (number ==null){
            number = new MutableLiveData<>();
            number.setValue(10);
        }
        return number;
    }
    //功能函数
    public void add(){
        number.setValue(number.getValue()+1);

    }
}
