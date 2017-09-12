package fr.sylvain.tp_databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import java.util.Observable;

/**
 * Created by SYLVAIN on 12/09/2017.
 */


public class UserViewModel extends BaseObservable {

    private String name = "";
    public final ObservableField<String> lastName =
            new ObservableField<>();

    public UserViewModel(String name, String lastname) {
        this.lastName.set(lastname);
        this.name = name;
    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
        notifyPropertyChanged(BR.name);

    }





}

