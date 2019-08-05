package examples.aaronhoskins.com.mvvmexample.viewmodel;

import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;

import examples.aaronhoskins.com.mvvmexample.model.datasource.remote.mockauthenticationhelper.MockAuthenicationHelper;
import examples.aaronhoskins.com.mvvmexample.model.user.User;

public class LoginViewModel extends ViewModel {

    public String userName;

    public String password;

    public void onUserNameChanged(Editable userName) {
        this.userName = userName.toString();
        Log.d("TAG_VIEWMODEL", this.userName);
    }

    public void onPasswordChanged(Editable password) {
        this.password = password.toString();
        Log.d("TAG_VIEWMODEL", this.password);
    }

    public void login(View view) {
        final User validatingUser = new User(userName, password, "email@domain.com");
        if(MockAuthenicationHelper.getAuthenication(validatingUser) != null) {
            Toast.makeText(view.getContext(), "Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(view.getContext(), "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

}
