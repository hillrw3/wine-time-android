package winetime.winetime

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val wines = listOf(
            Wine("Chardonnay"),
            Wine("Cabernet Franc"),
            Wine("Pinot Noir")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
        val viewAdapter = WineViewAdapter(wines)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }
}
