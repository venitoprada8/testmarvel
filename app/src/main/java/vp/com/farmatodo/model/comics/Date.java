package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;


public class Date {

    @Expose
    private String type;
    @Expose
    private String date;


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

}
