package winetime.winetime

class WineRepo {
    fun getWines(): List<Wine> {
        return listOf(
                Wine("Chardonnay"),
                Wine("Cabernet Franc"),
                Wine("Pinot Noir")
        )
    }
}