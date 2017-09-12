package fr.sylvain.tp_databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.sylvain.tp_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UserViewModel userData = // your data is created here
        UserViewModel user = new UserViewModel("Sylvain", "Joly");

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user); // generated setter based on the data in the layout file
        binding.setPresenter(new Presenter(user));


    }
}
