package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class Stories {

    @Expose
    private Integer available;
    @Expose
    private String collectionURI;
    @Expose
    private List<Item_> items = new ArrayList<Item_>();
    @Expose
    private Integer returned;


    public Integer getAvailable() {
        return available;
    }


    public void setAvailable(Integer available) {
        this.available = available;
    }


    public String getCollectionURI() {
        return collectionURI;
    }


    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }


    public List<Item_> getItems() {
        return items;
    }


    public void setItems(List<Item_> items) {
        this.items = items;
    }

    public Integer getReturned() {
        return returned;
    }


    public void setReturned(Integer returned) {
        this.returned = returned;
    }

}
