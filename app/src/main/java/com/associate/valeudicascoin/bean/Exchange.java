package com.associate.valeudicascoin.bean;

import com.associate.valeudicascoin.db.PropertyDB;
import com.associate.valeudicascoin.db.TypeOf;

import org.json.JSONException;
import org.json.JSONObject;

public class Exchange {

    private PropertyDB name = new PropertyDB("name","","PNT_EXCHANGE","name");
    private PropertyDB color = new PropertyDB("color","","PNT_EXCHANGE","color");
    private PropertyDB url = new PropertyDB("url","","PNT_EXCHANGE","url");
    private PropertyDB url_book = new PropertyDB("url_book","","PNT_EXCHANGE","url_book");
    private PropertyDB fees_in_BRL = new PropertyDB("fees_in_BRL","","PNT_EXCHANGE","fees_in_BRL", TypeOf.
            JSON);
    private PropertyDB fees_in_BTC = new PropertyDB("fees_in_BTC","","PNT_EXCHANGE","fees_in_BTC",TypeOf.JSON);
    private PropertyDB fees_out_BRL = new PropertyDB("fees_out_BRL","","PNT_EXCHANGE","fees_out_BRL",TypeOf.JSON);
    private PropertyDB fees_out_BTC = new PropertyDB("fees_out_BTC","","PNT_EXCHANGE","fees_out_BTC",TypeOf.JSON);
    private PropertyDB trade_book = new PropertyDB("trade_book","","PNT_EXCHANGE","trade_book",TypeOf.JSON);
    private PropertyDB trade_market = new PropertyDB("trade_book","","PNT_EXCHANGE","trade_book",TypeOf.JSON);

    public Exchange() {
    }

    public Exchange(String jsonExchange) {
        ;
        try {
            JSONObject jsonObj = new JSONObject(jsonExchange);
           // jsonObj.
           // PropertyDB jsName = new PropertyDB()
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public Exchange(PropertyDB name, PropertyDB color, PropertyDB url, PropertyDB url_book, PropertyDB fees_in_BRL, PropertyDB fees_in_BTC,
                    PropertyDB fees_out_BRL, PropertyDB fees_out_BTC, PropertyDB trade_book, PropertyDB trade_market)
    {
        this.name = name;
        this.color = color;
        this.url = url;
        this.url_book = url_book;
        this.fees_in_BRL = fees_in_BRL;
        this.fees_in_BTC = fees_in_BTC;
        this.fees_out_BRL = fees_out_BRL;
        this.fees_out_BTC = fees_out_BTC;
        this.trade_book = trade_book;
        this.trade_market = trade_market;
    }





}
