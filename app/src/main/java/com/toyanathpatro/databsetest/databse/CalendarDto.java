package com.toyanathpatro.databsetest.databse;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adventure on 3/20/16.
 */
public class CalendarDto implements Parcelable {

    public CalendarDto() {

    }


    private int yearEn;
    private int monthEnId;
    private String monthEn;
    private int day;
    private int yearNp;
    private int monthNpId;
    private String mahina;
    private int gate;
    private String pakshya;
    private int dayId;
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
    private int isHoliday;
    private int isImportant;
    private String dayInfo;

    public void setMonthEn(String monthEn) {
        this.monthEn = monthEn;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYearNp(int yearNp) {
        this.yearNp = yearNp;
    }

    public void setMonthNpId(int monthNpId) {
        this.monthNpId = monthNpId;
    }

    public void setMahina(String mahina) {
        this.mahina = mahina;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public void setPakshya(String pakshya) {
        this.pakshya = pakshya;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public void setTithi(String tithi) {
        this.tithi = tithi;
    }

    public void setTithiEnd(String tithiEnd) {
        this.tithiEnd = tithiEnd;
    }

    public void setNewariTithi(String newariTithi) {
        this.newariTithi = newariTithi;
    }

    public void setNakshatra(String nakshatra) {
        this.nakshatra = nakshatra;
    }

    public void setNakshatraEnd(String nakshatraEnd) {
        this.nakshatraEnd = nakshatraEnd;
    }

    public void setYog(String yog) {
        this.yog = yog;
    }

    public void setYogEnd(String yogEnd) {
        this.yogEnd = yogEnd;
    }

    public void setKaran(String karan) {
        this.karan = karan;
    }

    public void setKaranEnd(String karanEnd) {
        this.karanEnd = karanEnd;
    }

    public void setAanandiyoga(String aanandiyoga) {
        this.aanandiyoga = aanandiyoga;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public void setBhadra(String bhadra) {
        this.bhadra = bhadra;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setIsHoliday(int isHoliday) {
        this.isHoliday = isHoliday;
    }

    public void setIsImportant(int isImportant) {
        this.isImportant = isImportant;
    }

    public void setDayInfo(String dayInfo) {
        this.dayInfo = dayInfo;
    }

    public void setMonthEnId(int monthEnId) {

        this.monthEnId = monthEnId;
    }

    public void setYearEn(int yearEn) {

        this.yearEn = yearEn;
    }

    public static Creator<CalendarDto> getCREATOR() {

        return CREATOR;
    }

    public String getDayInfo() {

        return dayInfo;
    }

    public int getIsImportant() {

        return isImportant;
    }

    public int getIsHoliday() {

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

    public int getDayId() {

        return dayId;
    }

    public String getPakshya() {

        return pakshya;
    }

    public int getGate() {

        return gate;
    }

    public int getYearEn() {

        return yearEn;
    }

    public String getMahina() {

        return mahina;
    }

    public int getMonthNpId() {

        return monthNpId;
    }

    public int getYearNp() {

        return yearNp;
    }

    public int getDay() {

        return day;
    }

    public String getMonthEn() {

        return monthEn;
    }

    public int getMonthEnId() {

        return monthEnId;
    }

    protected CalendarDto(Parcel in) {
        yearEn = in.readInt();
        monthEnId = in.readInt();
        monthEn = in.readString();
        day = in.readInt();
        yearNp = in.readInt();
        monthNpId = in.readInt();
        mahina = in.readString();
        gate = in.readInt();
        pakshya = in.readString();
        dayId = in.readInt();
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
        isHoliday = in.readInt();
        isImportant = in.readInt();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(yearEn);
        dest.writeInt(monthEnId);
        dest.writeString(monthEn);
        dest.writeInt(day);
        dest.writeInt(yearNp);
        dest.writeInt(monthNpId);
        dest.writeString(mahina);
        dest.writeInt(gate);
        dest.writeString(pakshya);
        dest.writeInt(dayId);
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
        dest.writeInt(isHoliday);
        dest.writeInt(isImportant);
        dest.writeString(dayInfo);
    }
}