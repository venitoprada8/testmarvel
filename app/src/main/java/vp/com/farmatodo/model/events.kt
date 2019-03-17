package vp.com.farmatodo.model

data class events(
    var attributionHTML: String,
    var attributionText: String,
    var code: Int,
    var copyright: String,
    var `data`: Data,
    var etag: String,
    var status: String
)

data class Data(
    var count: Int,
    var limit: Int,
    var offset: Int,
    var results: List<Result>,
    var total: Int
)

data class Result(
    var characters: Characters,
    var comics: Comics,
    var creators: Creators,
    var description: String,
    var end: String,
    var id: Int,
    var modified: String,
    var next: Next,
    var previous: Previous,
    var resourceURI: String,
    var series: Series,
    var start: String,
    var stories: Stories,
    var thumbnail: Thumbnail,
    var title: String,
    var urls: List<Url>
)

data class Characters(
    var available: Int,
    var collectionURI: String,
    var items: List<Item>,
    var returned: Int
)

data class Item(
    var name: String,
    var resourceURI: String
)

data class Next(
    var name: String,
    var resourceURI: String
)

data class Stories(
    var available: Int,
    var collectionURI: String,
    var items: List<ItemX>,
    var returned: Int
)

data class ItemX(
    var name: String,
    var resourceURI: String,
    var type: String
)

data class Comics(
    var available: Int,
    var collectionURI: String,
    var items: List<ItemXX>,
    var returned: Int
)

data class Series(
    var available: Int,
    var collectionURI: String,
    var items: List<ItemXX>,
    var returned: Int
)

data class Thumbnail(
    var extension: String,
    var path: String
)

data class Url(
    var type: String,
    var url: String
)

data class Creators(
    var available: Int,
    var collectionURI: String,
    var items: List<ItemXX>,
    var returned: Int
)

data class ItemXX(
    var name: String,
    var resourceURI: String,
    var role: String
)

data class Previous(
    var name: String,
    var resourceURI: String
)