package vp.com.farmatodo.model.character

data class Stories(
        var available: Int,
        var collectionURI: String,
        var items: List<Any>,
        var returned: Int
)