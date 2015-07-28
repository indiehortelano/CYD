package coloryourcalendar.indie.com.app.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kdeloria on 12/8/2014.
 * Modified by pparreno on 18/03/2015.
 */
public interface Viewable {

    View getView(int position, LayoutInflater inflater, View convertView, ViewGroup parent);

    int getViewType(int position);

    int getViewTypeCount();

    boolean isEnabled(int position);
}
