package coloryourday.indie.com.app.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

/**
 * Created by pauljohnparreno on 6/17/15.
 */
public interface RecyclerViewable {

    void onBindViewHolder(RecyclerView.ViewHolder holder, int position, LayoutInflater inflater);
}
