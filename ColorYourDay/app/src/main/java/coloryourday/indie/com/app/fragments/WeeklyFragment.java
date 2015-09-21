package coloryourday.indie.com.app.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import coloryourday.indie.com.app.R;
import coloryourday.indie.com.app.adapters.CydWeeklyCalendarRecyclerAdapter;
import coloryourday.indie.com.app.base.RecyclerViewable;
import coloryourday.indie.com.app.dbmodels.DailyCommitment;
import coloryourday.indie.com.app.enums.ColorEnum;
import coloryourday.indie.com.app.enums.CydEnums;
import coloryourday.indie.com.app.models.DailyCydModel;
import coloryourday.indie.com.app.models.WeeklyCydModel;
import coloryourday.indie.com.app.viewmodels.WeeklyCalendarViewModel;
import roboguice.fragment.RoboFragment;

import roboguice.inject.InjectView;

/**
 * Created by ihortelano on 7/14/15.
 */
public class WeeklyFragment extends RoboFragment {

    @InjectView(R.id.recycler_view)
    RecyclerView recyclerView;

    CydWeeklyCalendarRecyclerAdapter<RecyclerViewable> recyclerViewableCydWeeklyCalendarRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_weekly, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<RecyclerViewable> weeklyCalendarViewModels = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        for(int i = 0; i < 1; i++) {
            weeklyCalendarViewModels.add(new WeeklyCalendarViewModel(mockWeek()));
        }
        recyclerViewableCydWeeklyCalendarRecyclerAdapter = new CydWeeklyCalendarRecyclerAdapter<>(weeklyCalendarViewModels ,getActivity());
        recyclerView.setAdapter(recyclerViewableCydWeeklyCalendarRecyclerAdapter);
    }

    private WeeklyCydModel mockWeek() {
        WeeklyCydModel weeklyCydModel =  new WeeklyCydModel();
        DailyCydModel monday = new DailyCydModel();
        DailyCommitment dailyCommitment  = new DailyCommitment() ;
        dailyCommitment.colorValue = ColorEnum.GREEN;
        weeklyCydModel.cydEnums = CydEnums.DAILY_COMMITMENT;
        monday.setDailyCommitment(dailyCommitment);
        weeklyCydModel.setMonday(monday);
        weeklyCydModel.setTuesday(monday);
        weeklyCydModel.setWednesday(monday);
        weeklyCydModel.setThursday(monday);
        weeklyCydModel.setFriday(monday);
        weeklyCydModel.setSaturday(monday);
        weeklyCydModel.setSunday(monday);

        return weeklyCydModel;

    }


}
