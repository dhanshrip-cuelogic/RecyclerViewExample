package com.example.recyclerviewexample
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: Array<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        // Create a new view.
        val textView = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.my_text_view, viewGroup, false) as TextView
        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        println("---> ${myDataset[position]}")
        holder.textView.text = myDataset[position]
    }

    override fun getItemCount() = myDataset.size
}