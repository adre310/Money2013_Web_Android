package iae.home.money2012web;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "", // will not be used
formUri = "https://adre310.x10.mx/acra",
httpMethod = org.acra.sender.HttpSender.Method.PUT,
disableSSLCertValidation=true)
public class MyApplication extends Application {
@Override
public void onCreate() {
    ACRA.init(this);
    super.onCreate();
}
}
