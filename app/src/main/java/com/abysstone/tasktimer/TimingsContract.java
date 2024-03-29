package com.abysstone.tasktimer;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import static com.abysstone.tasktimer.AppProvider.CONTENT_AUTHORITY;
import static com.abysstone.tasktimer.AppProvider.CONTENT_AUTHORITY_URI;

public class TimingsContract {

    static final String TABLE_NAME = "Timings";

    //Timings fields
    public static class Columns {
        public static final String _ID = BaseColumns._ID;
        public static final String TIMINGS_TASK_ID = "Name";
        public static final String TIMINGS_START_TIME = "Description";
        public static final String TIMINGS_DURATION = "SortOrder";

        private Columns(){
            //private constructor to prevent instantiation...
        }
    }

    /**
     * The URI to access the Timings table
     */
    public static final Uri CONTENT_URI = Uri.withAppendedPath(CONTENT_AUTHORITY_URI, TABLE_NAME);

    static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd." + CONTENT_AUTHORITY + "." + TABLE_NAME;
    static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd." + CONTENT_AUTHORITY + "." + TABLE_NAME;

    public static Uri buildTimingUri(long TimingId){
        return ContentUris.withAppendedId(CONTENT_URI, TimingId);
    }

    public static long getTimingId(Uri uri){
        return ContentUris.parseId(uri);
    }

}
