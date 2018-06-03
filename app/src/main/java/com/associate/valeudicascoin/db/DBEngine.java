package com.associate.valeudicascoin.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.*;

import com.associate.valeudicascoin.global.AppGlobal;

public class DBEngine extends SQLiteOpenHelper  {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = AppGlobal.getInstance().getEndPointBD();

    private static final String SQL_BUILD_EXCHANGE = "CREATE TABLE PNT_EXCHANGE (" +
            " PNT_EXCHANGE_ID integer primary key autoincrement, " +
            " PNT_EXCHANGE_NAME text not null);";

    private static final String SQL_BUILD_TICKER = "CREATE TABLE PNT_TICKER (" +
            " PNT_TICKER_ID integer primary key autoincrement, " +
            " PNT_TICKER_TIMESTAMP_PUNTAL timestamp not null default CURRENT_TIMESTAMP, " +
            " PNT_TICKER_TIMESTAMP_TOTAL text not null, " +
            " PNT_TICKER_TIMESTAMP_EXCHANGES text not null);";

    private static final String SQL_BUILD_ORDERBOOK = "CREATE TABLE PNT_ORDERBOOK (" +
            " PNT_TICKER_ID integer primary key autoincrement, " +
            " PNT_TICKER_TIMESTAMP_PUNTAL timestamp not null default CURRENT_TIMESTAMP, " +
            " PNT_TICKER_TIMESTAMP_TOTAL text not null, " +
            " PNT_TICKER_TIMESTAMP_EXCHANGES text not null);";

    private static final String SQL_BUILD_ORDERBOOKSTAT = "CREATE TABLE PNT_ORDERBOOKSTAT (" +
            " PNT_TICKER_ID integer primary key autoincrement, " +
            " PNT_TICKER_TIMESTAMP_PUNTAL timestamp not null default CURRENT_TIMESTAMP, " +
            " PNT_TICKER_TIMESTAMP_TOTAL text not null, " +
            " PNT_TICKER_TIMESTAMP_EXCHANGES text not null);";

    public DBEngine(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DBEngine(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBEngine(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_BUILD_EXCHANGE);
        db.execSQL(SQL_BUILD_TICKER);
        db.execSQL(SQL_BUILD_ORDERBOOK);
        db.execSQL(SQL_BUILD_ORDERBOOKSTAT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
