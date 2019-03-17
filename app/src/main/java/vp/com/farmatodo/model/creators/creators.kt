package vp.com.farmatodo.model.creators

data class creators(
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
    var events: Events,
    var id: Int,
    var modified: String,
    var originalIssue: OriginalIssue,
    var resourceURI: String,
    var series: Series,
    var thumbnail: Any?,
    var title: String,
    var type: String
)

data class OriginalIssue(
    var name: String,
    var resourceURI: String
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

data class Comics(
    var available: Int,
    var collectionURI: String,
    var items: List<Item>,
    var returned: Int
)

data class Item(
    var name: String,
    var resourceURI: String
)

data class Creators(
    var available: Int,
    var collectionURI: String,
    var items: List<Any>,
    var returned: Int
)

data class Series(
    var available: Int,
    var collectionURI: String,
    var items: List<Item>,
    var returned: Int
)