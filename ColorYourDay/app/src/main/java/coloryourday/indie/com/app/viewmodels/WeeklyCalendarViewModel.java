package coloryourday.indie.com.app.viewmodels;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ListAdapter;

import java.util.List;

import coloryourday.indie.com.app.activity.utils.ViewUtil;
import coloryourday.indie.com.app.base.RecyclerViewModel;
import coloryourday.indie.com.app.base.ViewableListAdapter;
import coloryourday.indie.com.app.dbmodels.BaseModel;
import coloryourday.indie.com.app.models.DailyCydModel;
import coloryourday.indie.com.app.models.WeeklyCydModel;
import coloryourday.indie.com.app.viewholders.WeeklyCalendarViewHolder;

/**
 * Created by ihortelano on 7/15/15.
 */
public class WeeklyCalendarViewModel<K extends WeeklyCydModel> extends RecyclerViewModel {

    public WeeklyCalendarViewModel(K model) {
        super(model);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, LayoutInflater inflater) {
        WeeklyCalendarViewHolder weeklyCalendarViewHolder = (WeeklyCalendarViewHolder) holder;
        WeeklyCydModel weeklyCydModel = ((WeeklyCydModel) getObject());

        DailyCydModel monday = weeklyCydModel.getMonday();
        DailyCydModel tuesday = weeklyCydModel.getTuesday();
        DailyCydModel wednesday = weeklyCydModel.getWednesday();
        DailyCydModel thursday = weeklyCydModel.getThursday();
        DailyCydModel friday = weeklyCydModel.getFriday();
        DailyCydModel saturday = weeklyCydModel.getSaturday();
        DailyCydModel sunday = weeklyCydModel.getSunday();
        //ListAdapter boxAdapter = new ViewableListAdapter<>()

        switch (weeklyCydModel.cydEnums) {
            case MOOD:
                ViewUtil.paintColor(weeklyCalendarViewHolder.mondayView, monday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.tuedayView, tuesday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.wednesdayView, wednesday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.thursdayView, thursday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.fridayView, friday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.saturdayView, saturday.getMoodModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.sundayView, sunday.getMoodModel().colorValue);
                break;
            case DAILY_COMMITMENT:
                ViewUtil.paintColor(weeklyCalendarViewHolder.mondayView, monday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.tuedayView, tuesday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.wednesdayView, wednesday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.thursdayView, thursday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.fridayView, friday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.saturdayView, saturday.getDailyCommitment().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.sundayView, sunday.getDailyCommitment().colorValue);
                break;
            case ENERGY_LEVEL:
                ViewUtil.paintColor(weeklyCalendarViewHolder.mondayView, monday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.tuedayView, tuesday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.wednesdayView, wednesday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.thursdayView, thursday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.fridayView, friday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.saturdayView, saturday.getEnergyLevelModel().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.sundayView, sunday.getEnergyLevelModel().colorValue);
                break;
            case SPECIAL_GOAL:
                ViewUtil.paintColor(weeklyCalendarViewHolder.mondayView, monday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.tuedayView, tuesday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.wednesdayView, wednesday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.thursdayView, thursday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.fridayView, friday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.saturdayView, saturday.getSpecialGoal().colorValue);
                ViewUtil.paintColor(weeklyCalendarViewHolder.sundayView, sunday.getSpecialGoal().colorValue);
                break;
            default:
                break;
        }



    }
}
