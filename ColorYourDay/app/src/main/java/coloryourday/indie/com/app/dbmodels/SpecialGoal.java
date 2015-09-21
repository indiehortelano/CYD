package coloryourday.indie.com.app.dbmodels;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

import coloryourday.indie.com.app.enums.ColorEnum;

/**
 * Created by ihortelano on 7/14/15.
 */
@Table(name = "cyd_special_goal")
public class SpecialGoal extends BaseModel {

    @Column(name = "sg_date")
    public Date date;

    @Column(name = "sg_value")
    public ColorEnum colorValue;

    @Column(name = "el_description")
    public String description;
}
