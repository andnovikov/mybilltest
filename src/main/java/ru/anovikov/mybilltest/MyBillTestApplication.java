package ru.anovikov.mybilltest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.UUID;
import java.net.URL;
import java.net.URLEncoder;
import java.net.*;
import java.io.*;

public class MyBillTestApplication {
    public static void main(String[] argv) {
        String  baseurl = "https://mybill15.test.mybill.ru/api_cmd?command=",
                login = "novikom@mybill.ru",
                pass =  "59584A42EF92E7F4AA7CFC6E3707DABF", //"MlywvAo3ux",
                addr = "mybill15.test.mybill.ru";

        ObjectMapper mapper = new ObjectMapper();

        //For testing
        MyBillCommandReq msg = new MyBillCommandReq();
        msg.setLogin(login);
        msg.setPasswd(pass);

        MyBillAddCustomerPointMessageCommandReq cmd = new MyBillAddCustomerPointMessageCommandReq();

        MyBillAddCustomerPointMessageReq req = createMyBillAddCustomerPointMessageReq();
        List<MyBillAddCustomerPointMessageReq> add = new ArrayList();

        add.add(req);
        cmd.setAdd(add);

        try {
            String cmdString = URLEncoder.encode(mapper.writeValueAsString(cmd), "UTF-8").replace("%22", "%5C%22").replace("%3A", ":");
            System.out.println(cmdString);

            msg.setCmd(cmdString);

            String msgString = mapper.writeValueAsString(msg);
            System.out.println(msgString);

            URL url = new URL(baseurl + msgString);
            System.out.println(url);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());


            ObjectMapper objectMapper = new ObjectMapper();

            MyBillCommandRes res = objectMapper.readValue(response.toString(), MyBillCommandRes.class);
            System.out.println(res.getData());

            MyBillAddCustomerPointMessageCommandRes cmdRes = objectMapper.readValue(res.getData(), MyBillAddCustomerPointMessageCommandRes.class);
            System.out.println(cmdRes.getResults().get(0).getGuid());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static MyBillAddBonusExtQuickReq createMyBillAddBonusExtQuickReq () {
        MyBillAddBonusExtQuickReq req = new MyBillAddBonusExtQuickReq();
        DBLoyaltyAddBonus bns;

        try {
            String bnsStr = "{ \"messageKey\" : null, \"clientPhone\" : \"+79777573300\", \"amount\":10.0 }";
            ObjectMapper objectMapper = new ObjectMapper();
            bns = objectMapper.readValue(bnsStr, DBLoyaltyAddBonus.class);

            UUID uuid = UUID.randomUUID();
            req.setAmount(bns.getAmount());
            req.setGuid(uuid.toString());
            req.setPhone(bns.getClientPhone());
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return req;
    }

    private static MyBillAddBonusReq createMyBillAddBonusReq () {
        MyBillAddBonusReq req = new MyBillAddBonusReq();
        DBLoyaltyAddBonus bns;

        try {
            String bnsStr = "{ \"messageKey\" : null, \"clientPhone\" : \"+79777573300\", \"amount\":10.0 }";
            ObjectMapper objectMapper = new ObjectMapper();
            bns = objectMapper.readValue(bnsStr, DBLoyaltyAddBonus.class);

            UUID uuid = UUID.randomUUID();
            req.setAmount(bns.getAmount());
            req.setGuid(uuid.toString());
            req.setPhone(bns.getClientPhone());
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return req;
    }

    private static MyBillAddCustomerPointMessageReq createMyBillAddCustomerPointMessageReq () {
        MyBillAddCustomerPointMessageReq req = new MyBillAddCustomerPointMessageReq();

        req.setUniqId("123456789");
        req.setPhone("+788002000601");
        req.setEmail("788002000601@nvk.ru");
        /*
        "amount":200.00,
                "guid":"9803d32e-8fcd-4984-a736-9f02f726b3c0",
                "email":null,
                "phone":null,
                "uniqId":"12345678",
                "info":"Сообщение для покупателя"
        "showCount":3
        "showTill":"2019-10-23T18:25:43.511Z"
        "eventId":"123456",
                "eventDate":"2015-01-01T00:00:00+03",
                "eventType":"operation",
                "operationType":"purchase",
                "operationAmount":100.0000,
                "merchantName":"ЦУМ",
                "bankProduct":"Золотая карта"
        "mcc":"АЗС",
*/

        return req;
    }
}