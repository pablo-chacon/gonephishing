package com.example.credentialcollection;

public class TargetHost {

    private long id;
    private String content;

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

    String[] target() {

        String[] target = {setId(id), setContent(content)};
        return target;
    }
}
