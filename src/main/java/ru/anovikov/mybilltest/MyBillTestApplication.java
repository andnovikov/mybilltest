package ru.anovikov.mybilltest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
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

        MyBillAddBonusCommandReq cmd = new MyBillAddBonusCommandReq();

        MyBillAddBonusReq req = createMyBillAddBonusReq();
        List<MyBillAddBonusReq> add = new ArrayList();

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
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());


            ObjectMapper objectMapper = new ObjectMapper();

            MyBillCommandRes res = objectMapper.readValue(response.toString(), MyBillCommandRes.class);
            System.out.println(res.getData());

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
        req.setAmount(200);
        req.setGuid("9803d32e-8fcd-4984-a736-9f02f726b3c0");
        req.setPhone("+79777573300");
        req.setInfo("Дополнительная информация");

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
}