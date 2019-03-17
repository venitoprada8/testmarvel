package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;

import java.io.Serializable;


public class Thumbnail implements Serializable{

    @Expose
    private String path;
    @Expose
    private String extension;


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public String getExtension() {
        return extension;
    }


    public void setExtension(String extension) {
        this.extension = extension;
    }

}
