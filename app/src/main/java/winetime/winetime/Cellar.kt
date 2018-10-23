package winetime.winetime

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class Cellar : ViewModel() {
    private lateinit var wines: MutableLiveData<List<Wine>>
    @Inject
    lateinit var repo: WineRepo

    init {
        Syringe.inject(this)
    }

    fun getWines(): LiveData<List<Wine>> {
        if(!::wines.isInitialized) {
            wines = MutableLiveData()
            loadWines()
        }

        return wines
    }

    private fun loadWines() {
        wines = repo.getWines()
    }
}
