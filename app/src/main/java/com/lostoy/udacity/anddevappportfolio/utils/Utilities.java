package com.lostoy.udacity.anddevappportfolio.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by raymondlee on 16/8/5.
 */

public class Utilities {
    public static void showToastLong(Context context, String message) {
        Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public static void showToastShort(Context context, String message) {
        Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
