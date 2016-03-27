package com.toyanathpatro.databsetest.databse;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adventure on 3/20/16.
 */
public class CalendarDto implements Parcelable {

    public  CalendarDto (){

    }


    private String yearEn;
    private String monthEnId;
    private String monthEn;
    private String  day;
    private String yearNp;
    private String monthNpId;
    private String mahina;
    private String gate;
    private String pakshya;
    private String dayId;
    private String tithi;
    private String tithiEnd;
    private String newariTithi;
    private String nakshatra;
    private String nakshatraEnd;
    private String yog;
    private String yogEnd;
    private String karan;
    private String karanEnd;
    private String aanandiyoga;
    private String sunrise;
    private String sunset;
    private String bhadra;
    private String imageUrl;
    private String isHoliday;
    private String isImportant;
    private String dayInfo;


    protected CalendarDto(Parcel in) {
        yearEn = in.readString();
        monthEnId = in.readString();
        monthEn = in.readString();
        day = in.readString();
        yearNp = in.readString();
        monthNpId = in.readString();
        mahina = in.readString();
        gate = in.readString();
        pakshya = in.readString();
        dayId = in.readString();
        tithi = in.readString();
        tithiEnd = in.readString();
        newariTithi = in.readString();
        nakshatra = in.readString();
        nakshatraEnd = in.readString();
        yog = in.readString();
        yogEnd = in.readString();
        karan = in.readString();
        karanEnd = in.readString();
        aanandiyoga = in.readString();
        sunrise = in.readString();
        sunset = in.readString();
        bhadra = in.readString();
        imageUrl = in.readString();
        isHoliday = in.readString();
        isImportant = in.readString();
        dayInfo = in.readString();
    }

    public static final Creator<CalendarDto> CREATOR = new Creator<CalendarDto>() {
        @Override
        public CalendarDto createFromParcel(Parcel in) {
            return new CalendarDto(in);
        }

        @Override
        public CalendarDto[] newArray(int size) {
            return new CalendarDto[size];
        }
    };

    /*private String eventOne;
        private String eventTwo;
    */
    public void setDayInfo(String dayInfo) {
        this.dayInfo = dayInfo;
    }

    public String getDayInfo() {

        return dayInfo;
    }


   /* public void setEventTwo(String eventTwo) {
        this.eventTwo = eventTwo;
    }
*/
    /*public void setEventOne(String eventOne) {

        this.eventOne = eventOne;
    }
*/


    public void setImageUrl(String imageUrl) {

        this.imageUrl = imageUrl;
    }

    public void setBhadra(String bhadra) {

        this.bhadra = bhadra;
    }

    public void setSunset(String sunset) {

        this.sunset = sunset;
    }

    public void setSunrise(String sunrise) {

        this.sunrise = sunrise;
    }

    public void setAanandiyoga(String aanandiyoga) {

        this.aanandiyoga = aanandiyoga;
    }

    public void setKaranEnd(String karanEnd) {

        this.karanEnd = karanEnd;
    }

    public void setKaran(String karan) {

        this.karan = karan;
    }

    public void setYogEnd(String yogEnd) {

        this.yogEnd = yogEnd;
    }

    public void setYog(String yog) {

        this.yog = yog;
    }

    public void setNakshatraEnd(String nakshatraEnd) {

        this.nakshatraEnd = nakshatraEnd;
    }

    public void setNakshatra(String nakshatra) {

        this.nakshatra = nakshatra;
    }

    public void setNewariTithi(String newariTithi) {
        this.newariTithi = newariTithi;

    }

    public void setTithiEnd(String tithiEnd) {

        this.tithiEnd = tithiEnd;
    }

    public void setTithi(String tithi) {

        this.tithi = tithi;
    }

    public void setDayId(String dayId) {

        this.dayId = dayId;
    }

    public void setPakshya(String pakshya) {

        this.pakshya = pakshya;
    }

    public void setGate(String gate) {

        this.gate = gate;
    }

    public void setMahina(String mahina) {

        this.mahina = mahina;
    }

    public void setMonthNpId(String monthNpId) {

        this.monthNpId = monthNpId;
    }

    public void setYearNp(String yearNp) {

        this.yearNp = yearNp;
    }

    public void setDay(String day) {

        this.day = day;
    }

    public void setMonthEn(String monthEn) {

        this.monthEn = monthEn;
    }

    public void setMonthEnId(String monthEnId) {

        this.monthEnId = monthEnId;
    }

    public void setYearEn(String yearEn) {

        this.yearEn = yearEn;
    }

   /* public String getEventTwo() {

        return eventTwo;
    }

    public String getEventOne() {

        return eventOne;
    }*/

    public void setIsImportant(String isImportant) {
        this.isImportant = isImportant;
    }

    public void setIsHoliday(String isHoliday) {

        this.isHoliday = isHoliday;
    }

    public String getIsImportant() {

        return isImportant;
    }

    public String getIsHoliday() {

        return isHoliday;
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public String getBhadra() {

        return bhadra;
    }

    public String getSunset() {

        return sunset;
    }

    public String getSunrise() {

        return sunrise;
    }

    public String getAanandiyoga() {

        return aanandiyoga;
    }

    public String getKaranEnd() {

        return karanEnd;
    }

    public String getKaran() {

        return karan;
    }

    public String getYogEnd() {

        return yogEnd;
    }

    public String getYog() {

        return yog;
    }

    public String getNakshatraEnd() {

        return nakshatraEnd;
    }

    public String getNakshatra() {

        return nakshatra;
    }

    public String getNewariTithi() {

        return newariTithi;
    }

    public String getTithiEnd() {

        return tithiEnd;
    }

    public String getTithi() {

        return tithi;
    }

    public String getDayId() {

        return dayId;
    }

    public String getPakshya() {

        return pakshya;
    }

    public String getGate() {

        return gate;
    }

    public String getMahina() {

        return mahina;
    }

    public String getMonthNpId() {

        return monthNpId;
    }

    public String getYearNp() {

        return yearNp;
    }

    public String getDay() {

        return day;
    }

    public String getMonthEn() {

        return monthEn;
    }

    public String getMonthEnId() {

        return monthEnId;
    }

    public String getYearEn() {

        return yearEn;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(yearEn);
        dest.writeString(monthEnId);
        dest.writeString(monthEn);
        dest.writeString(day);
        dest.writeString(yearNp);
        dest.writeString(monthNpId);
        dest.writeString(mahina);
        dest.writeString(gate);
        dest.writeString(pakshya);
        dest.writeString(dayId);
        dest.writeString(tithi);
        dest.writeString(tithiEnd);
        dest.writeString(newariTithi);
        dest.writeString(nakshatra);
        dest.writeString(nakshatraEnd);
        dest.writeString(yog);
        dest.writeString(yogEnd);
        dest.writeString(karan);
        dest.writeString(karanEnd);
        dest.writeString(aanandiyoga);
        dest.writeString(sunrise);
        dest.writeString(sunset);
        dest.writeString(bhadra);
        dest.writeString(imageUrl);
        dest.writeString(isHoliday);
        dest.writeString(isImportant);
        dest.writeString(dayInfo);
    }
}
