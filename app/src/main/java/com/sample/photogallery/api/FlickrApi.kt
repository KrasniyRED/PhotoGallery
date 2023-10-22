package com.sample.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "e226a2ae690f337dcdbea96fde663f07"
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse

}