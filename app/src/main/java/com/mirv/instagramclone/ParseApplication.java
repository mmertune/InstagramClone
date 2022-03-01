package com.mirv.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QWdqsz3jjmPcyrCt38j0tlpNcQ4llq8VI8kNWH8y")
                .clientKey("qbiSoXribhhEzLTTN0swQu1JamzPsBFLrxf58Gzl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
