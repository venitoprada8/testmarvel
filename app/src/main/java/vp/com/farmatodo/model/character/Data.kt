package vp.com.farmatodo.model.character

data class Data(
        var count: Int,
        var limit: Int,
        var offset: Int,
        var results: List<Result>,
        var total: Int
)