package com.company.service.impl;

import com.company.model.People;
import com.company.repository.FileRepository;
import com.company.service.JsonParser;
import com.google.gson.Gson;

public class JsonParserGson implements JsonParser {
    private Gson gson = new Gson();
    private FileRepository fileRepository=new FileRepository();


    @Override
    public String parseToJsonAndWriteInFile(People... o) {
        String str="export const members = " + gson.toJson(o); //""sra mejin@ avelacrecinq vor jsi mej avelacnenq
        fileRepository.writeInFile(str);
        return str;
    }

    @Override
    public Object parseFromJson(String jsonStr, Class c) {

        return gson.fromJson(jsonStr,c);
    }
}
