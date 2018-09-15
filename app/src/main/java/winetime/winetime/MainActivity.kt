package winetime.winetime

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var wineRepo: WineRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        (this.application as WineTimeApplication).injector.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
        val viewAdapter = WineViewAdapter(wineRepo.getWines())

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }
}
