package MX.TeosentliTeam.teosentli.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsVerticalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewsVerticalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Texto de News");
    }

    public LiveData<String> getText() {
        return mText;
    }
}