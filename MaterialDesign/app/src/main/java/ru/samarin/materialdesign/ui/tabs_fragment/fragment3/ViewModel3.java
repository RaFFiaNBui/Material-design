package ru.samarin.materialdesign.ui.tabs_fragment.fragment3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModel3 extends ViewModel {

    private MutableLiveData<String> mText;

    public ViewModel3() {
        mText = new MutableLiveData<>();
        mText.setValue("This is third fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}