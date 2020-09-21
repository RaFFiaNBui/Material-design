package ru.samarin.materialdesign.ui.fruit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FruitViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FruitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}