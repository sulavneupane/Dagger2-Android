package com.nepalicoders.dagger2;

/**
 * Created by Sulav on 8/29/17.
 */

public class Email {

    EmailApi mEmailApi;
    String mMailUrl;

    public Email(EmailApi emailApi, String mailUrl) {
        mEmailApi = emailApi;
        mMailUrl = mailUrl;
    }

    public boolean send(String body) {
        mEmailApi.sendEmail(body, mMailUrl);
        return true;
    }

}
