package com.e16din.intentmaster;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

public class OpenMaster {

    private OpenMaster() {
        super();
    }

    public static void call(@NonNull Activity activity, @NonNull String phone) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phone));
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Log.w("OpenMaster", "call: here to request the missing permission " +
                    "<uses-permission android:name=\"android.permission.CALL_PHONE\" />");
            return;
        }
        activity.startActivity(intent);
    }

    public static void sendSms(@NonNull Activity activity, @NonNull String phone, @NonNull String message) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("sms:" + phone));
        intent.putExtra("sms_body", message);
        activity.startActivity(intent);
    }

    public static void openMap(@NonNull Activity activity, double lat, double lng, @NonNull String title) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + lat + "," + lng + " (" + title + ")"));
        activity.startActivity(intent);
    }

    public static void openGoogleMap(@NonNull Activity activity, @NonNull String text) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + text));
        intent.setPackage("com.google.android.apps.maps");
        activity.startActivity(intent);
    }

    public static void openNavigationMap(@NonNull Activity activity, @NonNull String address) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=" + address));
        activity.startActivity(intent);
    }

    public static void openMap(@NonNull Activity activity, @NonNull String lat, @NonNull String lng, @NonNull String title) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + lat + "," + lng + " (" + title + ")"));
        activity.startActivity(intent);
    }

    public static void openMap(@NonNull Activity activity, double lat, double lng) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + lat + "," + lng));
        activity.startActivity(intent);
    }

    public static void openMap(@NonNull Activity activity, @NonNull String lat, @NonNull String lng) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + lat + "," + lng));
        activity.startActivity(intent);
    }
}