package com.nepalicoders.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailComponent component = DaggerEmailComponent.builder()
                .emailModule(new EmailModule("sulavneupane@gmail.com"))
                .networkModule(new NetworkModule())
                .build();
        Email email = component.email();
        email.send("body");

        Email newEmail = component.email();
        newEmail.send("newBody");
    }
}
