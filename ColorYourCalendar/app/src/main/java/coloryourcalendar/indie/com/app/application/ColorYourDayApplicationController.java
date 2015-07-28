package coloryourcalendar.indie.com.app.application;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

import coloryourcalendar.indie.com.app.dbmodels.BaseModel;
import coloryourcalendar.indie.com.app.dbmodels.DailyCommitment;
import coloryourcalendar.indie.com.app.dbmodels.EnergyLevelModel;
import coloryourcalendar.indie.com.app.dbmodels.MoodModel;
import coloryourcalendar.indie.com.app.dbmodels.SpecialGoal;

/**
 * Created by ihortelano on 7/20/15.
 */
public class ColorYourDayApplicationController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /** ActiveAndroid Setup **/

        Configuration.Builder configurationBuilder = new Configuration.Builder(this);
        configurationBuilder.addModelClass(BaseModel.class);
        configurationBuilder.addModelClass(DailyCommitment.class);
        configurationBuilder.addModelClass(EnergyLevelModel.class);
        configurationBuilder.addModelClass(MoodModel.class);
        configurationBuilder.addModelClass(SpecialGoal.class);
        ActiveAndroid.initialize(configurationBuilder.create());
    }
}
