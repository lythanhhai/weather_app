/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Ly Thanh Hai
 */
public class testURL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        Scanner sc =new Scanner(System.in);
        String city = sc.nextLine();
        try{
        String uri=String.format("http://api.openweathermap.org/data/2.5/forecast?q=%s&APPID=685ebafde2aa0591bc76bf26895660c5&units=metric",city);
        String url = uri;
        URL obj=new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        int responseCode = con.getResponseCode();
//        System.out.println("URL :" +url);
//        System.out.println(responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine=in.readLine()) != null)
        {
          response.append(inputLine);        
        }
        in.close();
//        System.out.println(response);
//        System.out.println(response.toString());
        JSONObject myresponse = new JSONObject(response.toString());
//            System.out.println(myresponse);
//            System.out.println("cod :" +myresponse.getString("cod"));
             JSONObject cityObject = new JSONObject(myresponse.getJSONObject("city").toString());

//             JSONObject listObject = new JSONObject(myresponse.getJSONObject("list").toString());
//             JSONObject Object = new JSONObject(listObject.getJSONObject("0").toString());
//             JSONObject mainObject = new JSONObject(Object.getJSONObject("main").toString());
        JSONArray listArray =myresponse.getJSONArray("list");
        JSONObject Object =listArray.getJSONObject(9);
        JSONObject mainObject =Object.getJSONObject("main");
        JSONArray weatherArray =Object.getJSONArray("weather");
        JSONObject weatherObject =weatherArray.getJSONObject(0);
        String temp = String.valueOf(mainObject.getDouble("temp"));String iconUri=weatherObject.getString("icon");
        System.out.println(weatherObject.getString("icon"));String URL = String.format("http://openweathermap.org/img/wn/" + iconUri + "@2x.png");
        System.out.println(URL);
        //lấy icon
//           String iconUri=weatherObject.getString("icon");
//            System.out.println(listArray.length());
//            System.out.println(Object);
             System.out.println(mainObject.getDouble("temp"));
             System.out.println(Object );
//             System.out.println("city :" +cityObject);
//             System.out.println("name :" +cityObject.getString("name"));
//             System.out.println("sunrise :" +cityObject.getLong("sunrise"));


//System.out.println(mainObject.getString("humidity"));


//              System.out.println("temp :" +tempObject.getInt("temp"));
             //System.out.println("temp :" +listObject.getInt("temp"));
    }
     catch(Exception e)
    {System.out.println(1);}

    }
}

