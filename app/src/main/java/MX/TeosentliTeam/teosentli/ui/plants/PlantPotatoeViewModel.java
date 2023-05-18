package MX.TeosentliTeam.teosentli.ui.plants;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlantPotatoeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PlantPotatoeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Texto de Plants");
    }

    public LiveData<String> getText() {
        return mText;
    }
}