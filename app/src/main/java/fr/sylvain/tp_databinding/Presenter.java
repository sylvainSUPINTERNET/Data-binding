package fr.sylvain.tp_databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by SYLVAIN on 12/09/2017.
 */

public class Presenter {

    private UserViewModel user;

    public Presenter(UserViewModel user) {
        this.user = user;
    }


    public void changeValue(View v){
        Log.i("DataBinding", "Change value");
        user.setName("Jean");
        user.lastName.set("KIIIIEIEIEI");
        }



}
