package com.example.recyclerviewexample

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : Activity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var dataset: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(dataset)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }

    }

    private fun initDataset() {
        dataset = Array(DATASET_COUNT, {i -> "This is element # $i"})
    }

    companion object {
        private val DATASET_COUNT = 10
    }
}