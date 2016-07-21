package com.e16din.intentmaster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public final class Share {

    private Share() {
        super();
    }

    //share link
    public static void link(@NonNull Context context, @NonNull String url) {
        link(context, url, context.getString(R.string.intent_master_share_link_title));
    }

    public static void link(@NonNull Context context, @NonNull String text, String title) {
        text(context, text, title);
    }

    //share text
    public static void text(@NonNull Context context, @NonNull String text) {
        text(context, text, context.getString(R.string.intent_master_share_text_title));
    }

    public static void text(@NonNull Context context, @NonNull String text, String title) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
        context.startActivity(Intent.createChooser(shareIntent, title));
    }
}