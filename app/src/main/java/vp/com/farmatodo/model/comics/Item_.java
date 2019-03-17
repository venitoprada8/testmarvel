package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;


public class Item_ {

    @Expose
    private String resourceURI;
    @Expose
    private String name;
    @Expose
    private String type;


    public String getResourceURI() {
        return resourceURI;
    }


    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}
