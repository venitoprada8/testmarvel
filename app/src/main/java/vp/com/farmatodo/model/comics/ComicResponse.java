package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;

public class ComicResponse {

    @Expose
    private Integer code;
    @Expose
    private String status;
    @Expose
    private String copyright;
    @Expose
    private String attributionText;
    @Expose
    private String attributionHTML;
    @Expose
    private String etag;
    @Expose
    private Data data;


    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getCopyright() {
        return copyright;
    }


    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }


    public String getAttributionText() {
        return attributionText;
    }


    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }


    public String getAttributionHTML() {
        return attributionHTML;
    }


    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }


    public String getEtag() {
        return etag;
    }


    public void setEtag(String etag) {
        this.etag = etag;
    }


    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
    }

}
