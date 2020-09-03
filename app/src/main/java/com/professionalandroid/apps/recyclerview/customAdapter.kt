package com.professionalandroid.apps.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_sub.view.*
import kotlinx.android.synthetic.main.item.view.*
import java.text.SimpleDateFormat

class customAdapter : RecyclerView.Adapter<Holder>() {

    var listData = mutableListOf<Memo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent ,false)

        return Holder(itemView)
    }

    override fun getItemCount(): Int {
       return listData.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       val memo = listData.get(position)
        holder.setMemo(memo)
    }
}

class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){

    init {
        itemView.setOnClickListener{
            val intent = Intent(itemView.context , subActivity::class.java)
            intent.putExtra("no" , itemView.text_no.text)
            intent.putExtra("title" , itemView.text_title.text)
            intent.putExtra("date" , itemView.text_date.text)
            itemView.context.startActivity(intent)
        }
    }

    fun  setMemo(memo: Memo){
        itemView.text_no.text = "${memo.no}"
        itemView.text_title.text = memo.title

        var sdf = SimpleDateFormat("yyyy/MM/dd")
        val date = sdf.format(memo.timestamp)
        itemView.text_date.text = date

    }

}