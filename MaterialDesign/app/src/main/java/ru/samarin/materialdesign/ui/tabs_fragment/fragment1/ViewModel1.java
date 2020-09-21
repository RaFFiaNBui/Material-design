package ru.samarin.materialdesign.ui.tabs_fragment.fragment1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModel1 extends ViewModel {

    private MutableLiveData<String> mText;

    public ViewModel1() {
        mText = new MutableLiveData<>();
        mText.setValue("This is first fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}