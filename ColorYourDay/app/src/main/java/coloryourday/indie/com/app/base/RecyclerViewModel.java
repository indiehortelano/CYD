package coloryourday.indie.com.app.base;

/**
 * Created by pauljohnparreno on 6/17/15.
 */
public abstract class RecyclerViewModel<K> implements RecyclerViewable {

    public RecyclerViewModel(K model) {
        this.setObject(model);
    }

    private K object;

    public K getObject() {
        return object;
    }

    public void setObject(K object) {
        this.object = object;
    }

}
