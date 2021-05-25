package com.vietcas.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Url {
    private static final String JSON_FILE = System.getProperty("user.dir").concat("/resources/Urls.json");
    public static String currentUrl(String page){

        ObjectMapper objectMapper = new ObjectMapper();
        String finalUrl ;
        try{
            FileInputStream fileInputStream = new FileInputStream(JSON_FILE);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            Map<String, HashMap> urlData = objectMapper.readValue(bufferedReader, HashMap.class);
            String sitePath = urlData.get(page).get("url").toString();
            finalUrl = System.getenv("homeUrl").concat(sitePath);
            //close
            bufferedReader.close();
            inputStreamReader.close();
            bufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("This is error when reading the data json file!");
        }
        return finalUrl;
    }

}
