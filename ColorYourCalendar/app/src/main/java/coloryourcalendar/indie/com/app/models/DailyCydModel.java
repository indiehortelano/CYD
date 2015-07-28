package coloryourcalendar.indie.com.app.models;

import coloryourcalendar.indie.com.app.dbmodels.DailyCommitment;
import coloryourcalendar.indie.com.app.dbmodels.EnergyLevelModel;
import coloryourcalendar.indie.com.app.dbmodels.MoodModel;
import coloryourcalendar.indie.com.app.dbmodels.SpecialGoal;

/**
 * Created by ihortelano on 7/20/15.
 */
public class DailyCydModel {

    protected DailyCommitment dailyCommitment;

    protected EnergyLevelModel energyLevelModel;

    protected MoodModel moodModel;

    protected SpecialGoal specialGoal;

    public DailyCommitment getDailyCommitment() {
        return dailyCommitment;
    }

    public void setDailyCommitment(DailyCommitment dailyCommitment) {
        this.dailyCommitment = dailyCommitment;
    }

    public EnergyLevelModel getEnergyLevelModel() {
        return energyLevelModel;
    }

    public void setEnergyLevelModel(EnergyLevelModel energyLevelModel) {
        this.energyLevelModel = energyLevelModel;
    }

    public MoodModel getMoodModel() {
        return moodModel;
    }

    public void setMoodModel(MoodModel moodModel) {
        this.moodModel = moodModel;
    }

    public SpecialGoal getSpecialGoal() {
        return specialGoal;
    }

    public void setSpecialGoal(SpecialGoal specialGoal) {
        this.specialGoal = specialGoal;
    }
}
