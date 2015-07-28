package coloryourcalendar.indie.com.app.dbmodels;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

import coloryourcalendar.indie.com.app.enums.ColorEnum;

/**
 * Created by ihortelano on 7/14/15.
 */
@Table(name = "cyd_mood")
public class MoodModel extends BaseModel {
    @Column(name = "mood_date")
    public Date date;

    @Column(name = "mood_value")
    public ColorEnum colorValue;

    
}
