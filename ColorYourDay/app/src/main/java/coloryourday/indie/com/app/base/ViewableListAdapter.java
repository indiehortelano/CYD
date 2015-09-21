package coloryourday.indie.com.app.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by kdeloria on 12/9/2014.
 */
public class ViewableListAdapter<K extends Viewable> extends ArrayAdapter<K> {

    private LayoutInflater mInflater;

    public enum RowType {
        HEADER, MEMBER
    }

    public ViewableListAdapter(Context context, List<K> objects) {
        super(context, 0, objects);
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getViewTypeCount() {
        return RowType.values().length;
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getViewType(position);
    }


    /**
     * {@inheritDoc}
     *
     * @param position
     */
    @Override
    public K getItem(int position) {
      return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItem(position).getView(position, mInflater, convertView, parent);
    }

    @Override
    public boolean isEnabled(int position) {
        return getItem(position).isEnabled(position);
    }

}
