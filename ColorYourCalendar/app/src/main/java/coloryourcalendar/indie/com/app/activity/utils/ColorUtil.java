package coloryourcalendar.indie.com.app.activity.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import coloryourcalendar.indie.com.app.R;
import coloryourcalendar.indie.com.app.enums.ColorEnum;

/**
 * Created by ihortelano on 7/20/15.
 */
public class ColorUtil {

    public static int getColor(ColorEnum colorEnum, Context context) {
        switch (colorEnum) {
            case GREEN:
                return context.getResources().getColor(R.color.cyd_green);
            case YELLOWGREEN:
                return context.getResources().getColor(R.color.cyd_yellow_green);
            case YELLOW:
                return context.getResources().getColor(R.color.cyd_yellow);
            case ORANGE:
                return context.getResources().getColor(R.color.cyd_orange);
            case RED:
                return context.getResources().getColor(R.color.cyd_red);
            default:
                return context.getResources().getColor(R.color.cyd_yellow_green);
        }
    }
}
