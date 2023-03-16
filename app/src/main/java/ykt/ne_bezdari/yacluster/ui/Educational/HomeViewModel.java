package ykt.ne_bezdari.yacluster.ui.Educational;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Educational fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}