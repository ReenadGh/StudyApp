package com.example.myapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

//import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter(private val activity: Activity , private val items: ArrayList<Review>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
      return ItemViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.item_row,
              parent,
              false
          )
      )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val title = items[position].title1
        val dec = items[position].info
        val details = items[position].detalis


        holder.itemView.apply {
            textView4.text = title
            desc.text = dec
            RCard.setOnClickListener{   Dialog(activity , details) }


        }
    }

    override fun getItemCount() = items.size





    fun Dialog(activity2 : Activity,details : String ){

        val dialogBuilder = AlertDialog.Builder(activity2)

        // set message of alert dialog
        dialogBuilder.setMessage(details)



            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Ok ", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
            // negative button text and action


        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("  ")
        // show alert dialog
        alert.show()

    }

}