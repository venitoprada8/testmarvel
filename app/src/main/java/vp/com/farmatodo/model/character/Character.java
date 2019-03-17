package vp.com.farmatodo.model.character;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import vp.com.farmatodo.model.comics.Events;
import vp.com.farmatodo.model.comics.Series;
import vp.com.farmatodo.model.comics.Stories;
import vp.com.farmatodo.model.comics.Thumbnail;
import vp.com.farmatodo.model.comics.Url;


public class Character {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String description;
    @Expose
    private String modified;
    @Expose
    private Thumbnail thumbnail;
    @Expose
    private String resourceURI;
    @Expose
    private Comics comics;
    @Expose
    private Series series;
    @Expose
    private Stories stories;
    @Expose
    private Events events;
    @Expose
    private List<Url> urls = new ArrayList<Url>();


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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


    public Thumbnail getThumbnail() {
        return thumbnail;
    }


    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }


    public String getResourceURI() {
        return resourceURI;
    }


    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Comics getComics() {
        return comics;
    }


    public void setComics(Comics comics) {
        this.comics = comics;
    }


    public Series getSeries() {
        return series;
    }


    public void setSeries(Series series) {
        this.series = series;
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


    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

}
