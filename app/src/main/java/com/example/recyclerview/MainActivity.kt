package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var SettingRecyclerView: RecyclerView?=null
    var adapter:Adapter?=null
    lateinit var list:MutableList<SettingItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity_for_recycler_view)
        SettingRecyclerView=findViewById(R.id.recycler)

        CreatSettingList()

        adapter=Adapter(list)

        SettingRecyclerView!!.adapter=adapter
    }
    public fun CreatSettingList()
    {
        list= mutableListOf()
        list.add(SettingItem("Wifi and Setting","see wifi setting",R.drawable.ic_wifi))
        list.add(SettingItem("Apps and Permission","see application list",R.drawable.ic_setting_name))
        for(i:Int in 0 until 1000)
        {
        list.add(SettingItem("item num"+i+"title","item num"+i+"sub title",R.drawable.ic_wifi))
        }
    }


}