package com.biblio.model;

public class paragraph {
    private int order;
    private String content;

    public paragraph(int order, String content) {
        this.order = order;
        this.content = content;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
