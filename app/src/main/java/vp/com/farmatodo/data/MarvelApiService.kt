package vp.com.farmatodo.data

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable
import vp.com.farmatodo.model.comics.Comic
import vp.com.farmatodo.model.comics.ComicResponse

interface MarvelApiService {

    @GET("/v1/public/comics?limit=50&offset=50")
    abstract fun getComics(): Observable<ComicResponse>


    @GET("/v1/public/characters?limit=50&offset=50")
    abstract fun getCharacters(): Observable<ComicResponse>

    @GET("/v1/public/creators?limit=50&offset=50")
    abstract fun getCreators(): Observable<ComicResponse>

    @GET("/v1/public/events?limit=50&offset=50")
    abstract fun getEvents(): Observable<ComicResponse>

    @GET("/v1/public/series?limit=50&offset=50")
    abstract fun getSeries(): Observable<ComicResponse>

    @GET("/v1/public/stories?limit=50&offset=50")
    abstract fun getStories(): Observable<ComicResponse>
}