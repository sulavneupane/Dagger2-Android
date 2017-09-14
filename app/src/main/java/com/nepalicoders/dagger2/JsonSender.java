package com.nepalicoders.dagger2;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;

/**
 * Created by Sulav on 8/29/17.
 */

@Singleton
public class JsonSender {

    private OkHttpClient mOkHttpClient;

    @Inject
    public JsonSender(OkHttpClient okHttpClient) {
        mOkHttpClient = okHttpClient;
    }

    public void sendJson(String json) {
        System.out.println("send json: " + json);
    }

}
