package com.example.aldielistviewdangridview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inisialisasi RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        val itemList = listOf(
            ItemList("Nissan", "Skyline GTR R34",
                "https://i.ebayimg.com/images/g/bbAAAOSw1-RUaoP4/s-l1200.jpg"),
            ItemList("Mazda", "FD RX7 Rocket Bunny",
                "https://www.greddy.com/cdn/shop/files/17040XXX_FD_RocketBunny_a_1_1.jpg"),
            ItemList("Toyota", "GT86 Rocket Bunny",
                "https://imgx.gridoto.com/crop/108x0:1860x1000/700x465/photo/gridoto/2018/11/18/1986797462.jpg")
        )
        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}