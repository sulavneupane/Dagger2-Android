package com.nepalicoders.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Sulav on 8/29/17.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    OkHttpClient providesOkHttpClient() {
        return new OkHttpClient();
    }

}
