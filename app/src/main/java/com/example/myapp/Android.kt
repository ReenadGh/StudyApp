package com.example.myapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class Android : AppCompatActivity() {


    lateinit var input : EditText
    lateinit var buttonGuess : Button

    lateinit var items:  ArrayList<Review>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_gusses)


        items  = arrayListOf()

        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = RecyclerViewAdapter(this , items)
        myRV.layoutManager = LinearLayoutManager(this)
        myRV.adapter!!.notifyDataSetChanged()


        items.add(Review(1,"FUNCTIONS","allow us to modularize the code by separating","fun main() {\n" +
                "  myFunction() // Call myFunction\n" +
                "}\n"))

        items.add(Review(1,"ARRAYS","we cannot make any changes to it.\n" +
                "Fixed size\n","val arrayname = listOf(--,--,--)"))
        items.add(Review(1,"ARRAYS","we can make changes to it.\n" +
                "Fixed size\n","val arrayname = arrayOf(--,--,--)"))
        items.add(Review(1,"2D ARRAYS","Var arrayname = arrayListOf<ArrayList<String>>()","To access :\n" +
                "Arrayname[indexof big list , index of inside list ]\n"))
        items.add(Review(1,"DICTIONARIES","allow us to set key value map to unique value","Ex :\nval seats = mapOf(1 to \"Sara\", 2 to \"Jim\", 3 to \"Jane\")"))
        items.add(Review(1,"ARRAYS","we cannot make any changes to it.\n" +
                "Fixed size\n","val arrayname = listOf(--,--,--)"))
        items.add(Review(1,"ARRAYS","we can make changes to it.\n" +
                "Fixed size\n","val arrayname = arrayOf(--,--,--)"))
        items.add(Review(1,"2D ARRAYS","Var arrayname = arrayListOf<ArrayList<String>>()","To access :\n" +
                "Arrayname[indexof big list , index of inside list ]\n"))
        items.add(Review(1,"DICTIONARIES","allow us to set key value map to unique value","Ex :\nval seats = mapOf(1 to \"Sara\", 2 to \"Jim\", 3 to \"Jane\")"))
    }





}