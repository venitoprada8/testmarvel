package vp.com.farmatodo.model.comics;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Comic {

    @Expose
    private Integer id;
    @Expose
    private Integer digitalId;
    @Expose
    private String title;
    @Expose
    private Integer issueNumber;
    @Expose
    private String variantDescription;
    @Expose
    private String description;
    @Expose
    private String modified;
    @Expose
    private String isbn;
    @Expose
    private String upc;
    @Expose
    private String diamondCode;
    @Expose
    private String ean;
    @Expose
    private String issn;
    @Expose
    private String format;
    @Expose
    private Integer pageCount;
    @Expose
    private List<TextObject> textObjects = new ArrayList<TextObject>();
    @Expose
    private String resourceURI;
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    @Expose
    private Series series;
    @Expose
    private List<Object> variants = new ArrayList<Object>();
    @Expose
    private List<Object> collections = new ArrayList<Object>();
    @Expose
    private List<Object> collectedIssues = new ArrayList<Object>();
    @Expose
    private List<Date> dates = new ArrayList<Date>();
    @Expose
    private List<Price> prices = new ArrayList<Price>();
    @Expose
    private Thumbnail thumbnail;
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @Expose
    private Creators creators;
    @Expose
    private Characters characters;
    @Expose
    private Stories stories;
    @Expose
    private Events events;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDigitalId() {
        return digitalId;
    }


    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }


    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }


    public String getVariantDescription() {
        return variantDescription;
    }


    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getModified() {
        return modified;
    }


    public void setModified(String modified) {
        this.modified = modified;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getUpc() {
        return upc;
    }


    public void setUpc(String upc) {
        this.upc = upc;
    }


    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }


    public String getEan() {
        return ean;
    }


    public void setEan(String ean) {
        this.ean = ean;
    }


    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }


    public String getFormat() {
        return format;
    }


    public void setFormat(String format) {
        this.format = format;
    }


    public Integer getPageCount() {
        return pageCount;
    }


    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


    public List<TextObject> getTextObjects() {
        return textObjects;
    }


    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }


    public String getResourceURI() {
        return resourceURI;
    }


    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }


    public List<Url> getUrls() {
        return urls;
    }


    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }


    public Series getSeries() {
        return series;
    }


    public void setSeries(Series series) {
        this.series = series;
    }


    public List<Object> getVariants() {
        return variants;
    }


    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }


    public List<Object> getCollections() {
        return collections;
    }


    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }


    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<Object> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }


    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<Price> getPrices() {
        return prices;
    }


    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }


    public Thumbnail getThumbnail() {
        return thumbnail;
    }


    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }


    public List<Image> getImages() {
        return images;
    }


    public void setImages(List<Image> images) {
        this.images = images;
    }


    public Creators getCreators() {
        return creators;
    }


    public void setCreators(Creators creators) {
        this.creators = creators;
    }


    public Characters getCharacters() {
        return characters;
    }


    public void setCharacters(Characters characters) {
        this.characters = characters;
    }


    public Stories getStories() {
        return stories;
    }


    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public Events getEvents() {
        return events;
    }


    public void setEvents(Events events) {
        this.events = events;
    }

}
