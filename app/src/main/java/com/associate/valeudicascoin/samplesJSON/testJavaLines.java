package com.associate.valeudicascoin.samplesJSON;

import org.json.JSONException;
import org.json.JSONObject;

public class testJavaLines
{

    public static void main(String[] args)
    {
        String jsobj = "{\"MBT\":{\"name\":\"Mercado Bitcoin\",\"color\":\"e6194b\",\"url\":\"https://www.mercadobitcoin.com.br\",\"url_book\":\"https://www.mercadobitcoin.com.br/BRLBTC/negociacoes/\",\"fees\":{\"in_BRL\":[0.0199,2.9],\"in_BTC\":[0,0],\"out_BRL\":[0.0199,2.9],\"out_BTC\":[0,0],\"trade_book\":[0.003,0],\"trade_market\":[0.007,0]}},\n" +
                "\"B2U\":{\"name\":\"BitcoinToYou\",\"color\":\"0082c8\",\"url\":\"https://www.bitcointoyou.com\",\"url_book\":\"https://broker.bitcointoyou.com/Negociacoes/externo\",\"fees\":{\"in_BRL\":[0.0189,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0189,0],\"out_BTC\":[0,0],\"trade_book\":[0.0025,0],\"trade_market\":[0.006,0]}},\n" +
                "\"BAS\":{\"name\":\"Basebit\",\"color\":\"aaffc3\",\"url\":\"https://www.basebit.com.br\",\"url_book\":\"https://www.basebit.com.br\",\"fees\":{\"in_BRL\":[0.0149,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0149,0],\"out_BTC\":[0,0],\"trade_book\":[0.0025,0],\"trade_market\":[0.006,0]}},\n" +
                "\"FOX\":{\"name\":\"FoxBit\",\"color\":\"f58231\",\"url\":\"http://foxbit.com.br/\",\"url_book\":\"https://foxbit.exchange/#market\",\"fees\":{\"in_BRL\":[0.00,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0139,0],\"out_BTC\":[0,0.0002],\"trade_book\":[0.0025,0],\"trade_market\":[0.005,0]}},\n" +
                "\"BIV\":{\"name\":\"Bitinvest\",\"color\":\"e6beff\",\"url\":\"https://www.bitinvest.com.br\",\"url_book\":\"https://www.bitinvest.com.br/exchange/orders/negotiations\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0099,0],\"out_BTC\":[0,0],\"trade_book\":[0.003,0],\"trade_market\":[0.003,0]}},\n" +
                "\"FLW\":{\"name\":\"flowBTC\",\"color\":\"808080\",\"url\":\"https://trader.flowbtc.com\",\"url_book\":\"https://trader.flowbtc.com\",\"fees\":{\"in_BRL\":[0.005,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0119,8],\"out_BTC\":[0,0.0015],\"trade_book\":[0.0035,0],\"trade_market\":[0.0035,0]}},\n" +
                "\"NEG\":{\"name\":\"Negocie Coins\",\"color\":\"d2f53c\",\"url\":\"https://www.negociecoins.com.br\",\"url_book\":\"http://www.negociecoins.com.br/negociacoes\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0.009,8.9],\"out_BTC\":[0,0.001],\"trade_book\":[0.003,0],\"trade_market\":[0.004,0]}},\n" +
                "\"LOC\":{\"name\":\"LocalBitcoins\",\"color\":\"911eb4\",\"url\":\"https://localbitcoins.com/\",\"url_book\":\"https://localbitcoins.com/\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0,0],\"out_BTC\":[0,0],\"trade_book\":[0.01,0],\"trade_market\":[0,0]}},\n" +
                "\"ARN\":{\"name\":\"Arena Bitcoin\",\"color\":\"ffd8b1\",\"url\":\"http://www.arenabitcoin.com.br/\",\"url_book\":\"https://www.arenabitcoin.com/markets/btccny\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0.001,0],\"out_BTC\":[0,0.0005],\"trade_book\":[0.0015,0],\"trade_market\":[0.0015,0]}},\n" +
                "\"PAX\":{\"name\":\"Paxful\",\"color\":\"ffe119\",\"url\":\"https://paxful.com/\",\"url_book\":\"https://paxful.com/buy-bitcoin\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0,0],\"out_BTC\":[0,0],\"trade_book\":[0.01,0],\"trade_market\":[0,0]}},\n" +
                "\"BSQ\":{\"name\":\"Bitsquare\",\"color\":\"800000\",\"url\":\"https://bitsquare.io/\",\"url_book\":\"https://market.bitsquare.io/?market=btc_brl\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0,0],\"out_BTC\":[0,0],\"trade_book\":[0,0.0005],\"trade_market\":[0,0.001]}},\n" +
                "\"BTD\":{\"name\":\"BitcoinTrade\",\"color\":\"000000\",\"url\":\"https://bitcointrade.com.br/\",\"url_book\":\"https://bitcointrade.com.br/marketplace\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0099,4.9],\"out_BTC\":[0,0],\"trade_book\":[0.005,0],\"trade_market\":[0.005,0]}},\n" +
                "\"BZX\":{\"name\":\"Braziliex\",\"color\":\"3cb44b\",\"url\":\"https://braziliex.com/\",\"url_book\":\"https://braziliex.com\",\"fees\":{\"in_BRL\":[0,0],\"in_BTC\":[0,0],\"out_BRL\":[0.0025,9],\"out_BTC\":[0,0.001],\"trade_book\":[0.005,0],\"trade_market\":[0.005,0]}}\n" +
                "}";
        JSONObject js = null;
        try {
            js = new JSONObject(jsobj);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.print(js.keys());
    }

}