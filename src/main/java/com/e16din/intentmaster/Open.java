package com.e16din.intentmaster;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

public class Open {

    private Open() {
        super();
    }

    public static void phone(@NonNull final Activity activity, @NonNull final String phone) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + phone));
                if (ActivityCompat.checkSelfPermission(activity,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Log.w("OpenMaster", "call: here to request the missing permission " +
                            "<uses-permission android:name=\"android.permission.CALL_PHONE\" />");
                    return;
                }
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void sms(@NonNull final Activity activity, @NonNull final String phone, @NonNull final String msg) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + phone));
                intent.putExtra("sms_body", msg);
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void map(@NonNull final Activity activity, final double lat, final double lng,
                           @NonNull final String title) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + lat + "," + lng + " (" + title + ")"));
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void googleMap(@NonNull final Activity activity, @NonNull final String text) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + text));
                intent.setPackage("com.google.android.apps.maps");
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void navigationMap(@NonNull final Activity activity, @NonNull final String address) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=" + address));
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void map(@NonNull final Activity activity, @NonNull final String lat, @NonNull final String lng,
                           @NonNull final String title) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + lat + "," + lng + " (" + title + ")"));
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void map(@NonNull final Activity activity, final double lat, final double lng) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + lat + "," + lng));
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void map(@NonNull final Activity activity, @NonNull final String lat, @NonNull final String lng) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + lat + "," + lng));
                activity.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }
}