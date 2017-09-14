package com.nepalicoders.dagger2;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * Created by Sulav on 8/29/17.
 */

public class EmailApi {

    OkHttpClient mOkHttpClient;
    JsonSender mJsonSender;

    @Inject
    public EmailApi(OkHttpClient okHttpClient, JsonSender jsonSender) {
        mOkHttpClient = okHttpClient;
        mJsonSender = jsonSender;
    }

    public void sendEmail(String body, String emailUrl) {
        System.out.println("from: " + emailUrl);
        System.out.println("send email: " + body);
    }

    public void sendJson(String json) {
        mJsonSender.sendJson(json);
    }

}
