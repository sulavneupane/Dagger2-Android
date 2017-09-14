package com.nepalicoders.dagger2;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by Sulav on 8/29/17.
 */

@Singleton
@Component(modules = {
        EmailModule.class,
        NetworkModule.class
})
public interface EmailComponent {

    Email email();

    OkHttpClient network();

}
