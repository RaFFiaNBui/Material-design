package ru.samarin.materialdesign.ui.tabs_fragment.fragment2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModel2 extends ViewModel {

    private MutableLiveData<String> mText;

    public ViewModel2() {
        mText = new MutableLiveData<>();
        mText.setValue("This is second fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}