package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Data {

    @Expose
    private Integer offset;
    @Expose
    private Integer limit;
    @Expose
    private Integer total;
    @Expose
    private Integer count;
    @Expose
    @SerializedName("results")
    private List<Comic> comics = new ArrayList<Comic>();


    public Integer getOffset() {
        return offset;
    }


    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    public Integer getLimit() {
        return limit;
    }


    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    public Integer getCount() {
        return count;
    }


    public void setCount(Integer count) {
        this.count = count;
    }


    public List<Comic> getComics() {
        return comics;
    }


    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

}
