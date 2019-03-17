package vp.com.farmatodo.model.series

data class series(
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
    var description: Any?,
    var endYear: Int,
    var events: Events,
    var id: Int,
    var modified: String,
    var next: Any?,
    var previous: Any?,
    var rating: String,
    var resourceURI: String,
    var startYear: Int,
    var stories: Stories,
    var thumbnail: Thumbnail,
    var title: String,
    var type: String,
    var urls: List<Url>
)

data class Events(
    var available: Int,
    var collectionURI: String,
    var items: List<Any>,
    var returned: Int
)

data class Characters(
    var available: Int,
    var collectionURI: String,
    var items: List<Any>,
    var returned: Int
)

data class Stories(
    var available: Int,
    var collectionURI: String,
    var items: List<Item>,
    var returned: Int
)

data class Item(
    var name: String,
    var resourceURI: String,
    var type: String
)

data class Comics(
    var available: Int,
    var collectionURI: String,
    var items: List<ItemX>,
    var returned: Int
)

data class ItemX(
    var name: String,
    var resourceURI: String
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