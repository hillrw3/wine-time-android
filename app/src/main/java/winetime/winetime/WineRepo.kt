package winetime.winetime

import android.arch.lifecycle.MutableLiveData

class WineRepo {

    fun getWines(): MutableLiveData<List<Wine>> {
        val wines = listOf(
                Wine("Chardonnay"),
                Wine("Cabernet Franc"),
                Wine("Pinot Noir")
        )
        val wineLiveData = MutableLiveData<List<Wine>>()
        wineLiveData.postValue(wines)
        return wineLiveData
    }
}