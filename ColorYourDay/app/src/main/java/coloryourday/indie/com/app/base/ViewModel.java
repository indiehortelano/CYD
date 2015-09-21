package coloryourday.indie.com.app.base;

import android.view.View;

/**
 * Created by kdeloria on 12/8/2014.
 */

/**
 * Usage of this is to call setView() whenever getView(inflater, root) is implemented.
 * It's very untidy but I can't think of a better way to implement this yet
 *
 * @param <K>
 */
public abstract class ViewModel<K> extends Holder<K> implements Viewable {

    public ViewModel(K model) {
        this.setObject(model);
    }

    private View view;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}
