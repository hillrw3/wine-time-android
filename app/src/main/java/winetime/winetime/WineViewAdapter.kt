package winetime.winetime

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class WineViewAdapter(private val wines: List<Wine>) : RecyclerView.Adapter<WineViewAdapter.ViewHolder>() {
    class ViewHolder(val textView: View) : RecyclerView.ViewHolder(textView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_wine, parent, false) as View
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.findViewById<TextView>(R.id.wine).text = wines[position].name
    }

    override fun getItemCount(): Int = wines.size
}