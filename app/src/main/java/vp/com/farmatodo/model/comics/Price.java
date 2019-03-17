package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;


public class Price {

    @Expose
    private String type;
    @Expose
    private Double price;


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }

}
