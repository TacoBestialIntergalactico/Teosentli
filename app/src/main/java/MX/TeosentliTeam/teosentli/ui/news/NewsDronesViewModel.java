package MX.TeosentliTeam.teosentli.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsDronesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewsDronesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Texto de News");
    }

    public LiveData<String> getText() {
        return mText;
    }
}