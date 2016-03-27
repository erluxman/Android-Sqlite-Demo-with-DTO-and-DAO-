package com.toyanathpatro.databsetest.databse;

/**
 * Created by adventure on 2/1/16.
 */
public final class CalendarDataItems {



    public static final String DB_NAME = "toyanath";
    public static String TABLE_NAME = "calendar";
    public static final int DB_VERSION = 6;

    public static final String COLUMN_ID = "_dayID";
    public static final String YEAR_EN = "yearEn";
    public static final String MONTH_EN_ID = "month_en_id";
    public static final String MONTH_EN = "month_en";
    public static final String DAY = "day";
    public static final String YEAR_NP = "yearNp";
    public static final String MONTH_NP_ID = "month_np_id";
    public static final String MAHINA = "mahina";
    public static final String GATE = "gate";
    public static final String PAKSHYA = "pakshya";
    public static final String DAY_ID = "day_id";
    public static final String TITHI = "tithi";
    public static final String TITHI_END = "tithi_end";
    public static final String NEWARI_TITHI = "newari_tithi";
    public static final String NAKSHATRA = "nakshatra";
    public static final String NAKSHATRA_END = "nakshatra_end";
    public static final String YOG = "yog";
    public static final String YOG_END = "yog_end";
    public static final String KARAN = "karan";
    public static final String KARAN_END = "karan_end";
    public static final String AANADI_YOGA = "aanandiyoga";
    public static final String SUNRISE = "sunrise";
    public static final String SUNSET = "sunset";
    public static final String BHADRA = "bhadra";
    public static final String IMAGE_URL = "image_url";
    public static final String IS_HOLODAY = "is_holiday";
    public static final String IS_IMPORTANT = "is_important";
    public static final String DAY_INFO ="day_info";


    // data definition


    public static final String TEXT_TYPE_SMALL = " VARCHAR(10)";
    public static final String TEXT_TYPE_LONG = " VARCHAR(50)";
    public static final String INTEGER_TYPE = " INTEGER";

    private static final String COMMA_SEP = " , ";
    public static final String SQL_CREATE_CALENDAR_ENTRIES =
            "CREATE TABLE "+TABLE_NAME +
                    " ( "+
                    //COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    YEAR_EN + TEXT_TYPE_SMALL + COMMA_SEP +
                    MONTH_EN_ID + TEXT_TYPE_SMALL + COMMA_SEP +
                    MONTH_EN + TEXT_TYPE_SMALL + COMMA_SEP +
                    DAY + TEXT_TYPE_SMALL + COMMA_SEP +
                    YEAR_NP + TEXT_TYPE_SMALL + COMMA_SEP +
                    MONTH_NP_ID + TEXT_TYPE_SMALL + COMMA_SEP +
                    MAHINA + TEXT_TYPE_SMALL + COMMA_SEP +
                    GATE +TEXT_TYPE_SMALL+ COMMA_SEP +
                    PAKSHYA +TEXT_TYPE_SMALL+ COMMA_SEP +
                    DAY_ID +TEXT_TYPE_SMALL+ COMMA_SEP +
                    TITHI +TEXT_TYPE_SMALL+ COMMA_SEP +
                    TITHI_END +TEXT_TYPE_SMALL+ COMMA_SEP +
                    NEWARI_TITHI +TEXT_TYPE_SMALL+ COMMA_SEP +
                    NAKSHATRA +TEXT_TYPE_SMALL+ COMMA_SEP +
                    NAKSHATRA_END +TEXT_TYPE_SMALL+ COMMA_SEP +
                    YOG +TEXT_TYPE_SMALL+ COMMA_SEP +
                    YOG_END +TEXT_TYPE_SMALL+ COMMA_SEP +
                    KARAN +TEXT_TYPE_SMALL+ COMMA_SEP +
                    KARAN_END +TEXT_TYPE_SMALL+ COMMA_SEP +
                    AANADI_YOGA +TEXT_TYPE_SMALL+ COMMA_SEP +
                    SUNRISE +TEXT_TYPE_SMALL+ COMMA_SEP +
                    SUNSET +TEXT_TYPE_SMALL+ COMMA_SEP +
                    BHADRA +TEXT_TYPE_SMALL+ COMMA_SEP +
                    IMAGE_URL +TEXT_TYPE_SMALL+ COMMA_SEP +
                    IS_HOLODAY + TEXT_TYPE_SMALL+ COMMA_SEP +
                    IS_IMPORTANT +TEXT_TYPE_SMALL+ COMMA_SEP +
                    DAY_INFO +TEXT_TYPE_LONG +
                    
                    " ); ";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;


}
