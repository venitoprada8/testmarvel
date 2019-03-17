package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;


public class TextObject {

    @Expose
    private String type;
    @Expose
    private String language;
    @Expose
    private String text;

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getLanguage() {
        return language;
    }


    public void setLanguage(String language) {
        this.language = language;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

}
