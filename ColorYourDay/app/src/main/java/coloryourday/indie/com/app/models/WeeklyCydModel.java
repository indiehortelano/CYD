package coloryourday.indie.com.app.models;


import coloryourday.indie.com.app.enums.CydEnums;

/**
 * Created by ihortelano on 7/15/15.
 */
public class WeeklyCydModel {

    public CydEnums cydEnums;

    protected DailyCydModel monday;

    protected DailyCydModel tuesday;

    protected DailyCydModel wednesday;

    protected DailyCydModel thursday;

    protected DailyCydModel friday;

    protected DailyCydModel saturday;

    protected DailyCydModel sunday;

    public DailyCydModel getFriday() {
        return friday;
    }

    public void setFriday(DailyCydModel friday) {
        this.friday = friday;
    }

    public DailyCydModel getMonday() {
        return monday;
    }

    public void setMonday(DailyCydModel monday) {
        this.monday = monday;
    }

    public DailyCydModel getSaturday() {
        return saturday;
    }

    public void setSaturday(DailyCydModel saturday) {
        this.saturday = saturday;
    }

    public DailyCydModel getSunday() {
        return sunday;
    }

    public void setSunday(DailyCydModel sunday) {
        this.sunday = sunday;
    }

    public DailyCydModel getThursday() {
        return thursday;
    }

    public void setThursday(DailyCydModel thursday) {
        this.thursday = thursday;
    }

    public DailyCydModel getTuesday() {
        return tuesday;
    }

    public void setTuesday(DailyCydModel tuesday) {
        this.tuesday = tuesday;
    }

    public DailyCydModel getWednesday() {
        return wednesday;
    }

    public void setWednesday(DailyCydModel wednesday) {
        this.wednesday = wednesday;
    }
}
