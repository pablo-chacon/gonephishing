package com.example.credentialcollection;

import java.util.ArrayList;


public class TargetPost {

    private long id;
    private String content;
    public ArrayList<String> target;

    public ArrayList<String> TargetPost() {
        target = new ArrayList<>();
        id = Long.parseLong(String.valueOf(setId(id)));
        content = setContent(content);
        target.add(String.valueOf(id));
        target.add(content);
        return target;
    }

    public long getId() {
        return id;
    }

    public String setId(long id) {
        this.id = id;
        return null;
    }

    public String getContent() {
        return content;
    }

    public String setContent(String content) {
        this.content = content;
        return content;
    }

}
