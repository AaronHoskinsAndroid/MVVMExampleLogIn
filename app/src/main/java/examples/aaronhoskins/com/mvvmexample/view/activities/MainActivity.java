package examples.aaronhoskins.com.mvvmexample.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import examples.aaronhoskins.com.mvvmexample.R;
import examples.aaronhoskins.com.mvvmexample.databinding.ActivityMainBinding;
import examples.aaronhoskins.com.mvvmexample.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LoginViewModel loginViewModel = new LoginViewModel();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main );
        binding.setViewModel(loginViewModel);

    }
}
