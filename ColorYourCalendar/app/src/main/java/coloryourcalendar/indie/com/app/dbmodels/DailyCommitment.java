package coloryourcalendar.indie.com.app.dbmodels;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

import coloryourcalendar.indie.com.app.enums.ColorEnum;

/**
 * Created by ihortelano on 7/14/15.
 */
@Table(name = "cyd_daily_commitment")
public class DailyCommitment extends BaseModel {

    @Column(name = "dc_date")
    public Date date;

    @Column(name = "dc_value")
    public ColorEnum colorValue;

    @Column(name = "el_description")
    public String description;
}
