package uk.co.haxyshideout.aliuplugins.NoUpsideDown;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;

import com.aliucord.Utils;
import com.aliucord.annotations.AliucordPlugin;
import com.aliucord.entities.Plugin;

@AliucordPlugin(requiresRestart = false)
public class NoUpsideDown extends Plugin {

    @SuppressLint("WrongConstant")
    @Override
    public void start(Context context) {
        Utils.appActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    @Override
    public void stop(Context context) {
        Utils.appActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_USER);
    }

}
