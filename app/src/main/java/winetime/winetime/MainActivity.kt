package winetime.winetime

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val cellar = ViewModelProviders.of(this).get(Cellar::class.java)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cellar.getWines().observe(this, Observer {
            setupRecyclerView(it ?: emptyList())
        })
    }

    private fun setupRecyclerView(it: List<Wine>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WineViewAdapter(it)
    }
}
