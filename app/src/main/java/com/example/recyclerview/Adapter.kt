package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter(var items:List<SettingItem>): RecyclerView.Adapter<Adapter.SeetingItemViewHolder>()
{

    class SeetingItemViewHolder(itemView: View) :ViewHolder(itemView)
    {
        var title:TextView=itemView.findViewById(R.id.title)
        var subtitle:TextView=itemView.findViewById(R.id.subTitle)
        var image:ImageView=itemView.findViewById(R.id.image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeetingItemViewHolder {

        var view:View= LayoutInflater.from(parent.context).inflate(R.layout.setting_item,parent,false)
        return SeetingItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items!!.size
    }

    override fun onBindViewHolder(holder: SeetingItemViewHolder, position: Int) {
        var item:SettingItem=items.get(position)
        holder.title.setText(item.Title)
        holder.subtitle.setText(item.SubTitle)
        holder.image.setImageResource(item.get_image())
    }
}