package com.nepalicoders.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Sulav on 8/29/17.
 */

@Module
public class EmailModule {

    String mEmailUrl;

    public EmailModule(String emailUrl) {
        this.mEmailUrl = emailUrl;
    }

    @Provides
    @Singleton
    Email providesEmail(EmailApi client) {
        return new Email(client, mEmailUrl);
    }

    @Provides
    @Singleton
    EmailApi providesEmailApi(OkHttpClient client, JsonSender sender) {
        return new EmailApi(client, sender);
    }
}
