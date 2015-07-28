package coloryourcalendar.indie.com.app.viewmodels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import coloryourcalendar.indie.com.app.R;
import coloryourcalendar.indie.com.app.base.ViewModel;
import coloryourcalendar.indie.com.app.models.DailyCydModel;

/**
 * Created by ihortelano on 7/20/15.
 */
public class DailyCydViewModel extends ViewModel<DailyCydModel> {


    public DailyCydViewModel(DailyCydModel model) {
        super(model);
    }

    @Override
    public View getView(int position, LayoutInflater inflater, View convertView, ViewGroup parent) {
        View v;

        if(convertView == null) {
            v = inflater.inflate(R.layout.weekly_layout, parent, false);
        } else {
            v = convertView;
        }

        View monday =  v.findViewById(R.id.monday);
        View tuesday = v.findViewById(R.id.tuesday);
        View wednesday = v.findViewById(R.id.wednesday);
        View thursday = v.findViewById(R.id.thursday);
        View friday = v.findViewById(R.id.friday);
        View saturday = v.findViewById(R.id.saturday);
        View sunday = v.findViewById(R.id.sunday);

        //monday.setBackgroundColor(ColorUtil.getColor());

        return v;
    }

    @Override
    public int getViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
