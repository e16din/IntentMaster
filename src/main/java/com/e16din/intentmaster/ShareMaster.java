package com.e16din.intentmaster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public final class ShareMaster {

    private ShareMaster() {
        super();
    }

    //share link
    public static void shareLink(@NonNull Context context, @NonNull String url) {
        shareLink(context, url, context.getString(R.string.intent_master_share_link_title));
    }

    public static void shareLink(@NonNull Context context, @NonNull String text, String title) {
        shareText(context, text, title);
    }

    //share text
    public static void shareText(@NonNull Context context, @NonNull String text) {
        shareText(context, text, context.getString(R.string.intent_master_share_text_title));
    }

    public static void shareText(@NonNull Context context, @NonNull String text, String title) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
        context.startActivity(Intent.createChooser(shareIntent, title));
    }
}