package coloryourcalendar.indie.com.app.activity.utils;

import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import coloryourcalendar.indie.com.app.enums.ColorEnum;

/**
 * Created by kdeloria on 1/6/2015.
 * Revised for GourmetPH by pparreno on 1/21/2015.
 */
public class ViewUtil {

    public static TextView textView(View view, int id) {
        return (TextView) view.findViewById(id);
    }

    public static ImageView imageView(View view, int id) {
        return (ImageView) view.findViewById(id);
    }


    public static Button button(View view, int id) {
        return (Button) view.findViewById(id);
    }

    public static CheckBox checkbox(View view, int id) {
        return (CheckBox) view.findViewById(id);
    }

    public static ImageButton imageButton(View view, int id) {
        return (ImageButton) view.findViewById(id);
    }

    public static float dipToPixels(float val, DisplayMetrics metrics) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, val, metrics);
    }

    public static void paintColor(View v, ColorEnum colorEnum) {
        v.setBackgroundColor(ColorUtil.getColor(colorEnum, v.getContext()));
    }



    public static Float metersToKilometers(float meters) {
        return meters / 1000f;
    }
}
