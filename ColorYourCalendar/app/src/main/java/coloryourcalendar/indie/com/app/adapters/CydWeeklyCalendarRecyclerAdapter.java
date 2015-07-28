package coloryourcalendar.indie.com.app.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import coloryourcalendar.indie.com.app.R;
import coloryourcalendar.indie.com.app.base.BaseRecyclerAdapter;
import coloryourcalendar.indie.com.app.base.RecyclerViewable;
import coloryourcalendar.indie.com.app.interfaces.OnRecyclerItemClickListener;
import coloryourcalendar.indie.com.app.viewholders.WeeklyCalendarViewHolder;

/**
 * Created by ihortelano on 7/15/15.
 */
public class CydWeeklyCalendarRecyclerAdapter<RecyclerViewable> extends BaseRecyclerAdapter implements OnRecyclerItemClickListener {

    public CydWeeklyCalendarRecyclerAdapter(ArrayList<RecyclerViewable> myDataset, Context context) {
        super(myDataset, context);
    }

    @Override
    public void onItemClick(View caller, int position) {
        //TODO handle all item clicks here

        Toast.makeText(caller.getContext(), "did you just clicked me?", Toast.LENGTH_SHORT).show();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.weekly_layout, parent, false);

        // set the view's size, margins, paddings and layout parameters
        WeeklyCalendarViewHolder vh = new WeeklyCalendarViewHolder(v, this);
        return vh;
    }
}
