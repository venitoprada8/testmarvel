package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;


public class Item__ {

    @Expose
    private String resourceURI;
    @Expose
    private String name;

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

}
