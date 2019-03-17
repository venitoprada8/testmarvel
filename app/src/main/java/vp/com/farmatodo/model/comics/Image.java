package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;

public class Image {

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
