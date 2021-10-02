package com.example.myapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class Kotlin : AppCompatActivity() {

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


        items.add(Review(2,"SNACKBAR","Allow us to give a massage box to the user ","Snackbar.make(layout,,”text”,\n" +
                "Snackbar.LENGTH_SHORT).show()\n" +
                "  myFunction() // Call myFunction\n" +
                "}\n"))
        items.add(Review(2,"RECYCLER VIEW","makes it easy to efficiently display large sets of data","Access in mainActivity :\n" +
                "\n" +
                "val myRV = findViewById<RecyclerView>(R.id.rvMain)\n" +
                "myRV.adapter = RecyclerViewAdapter(tasks)\n" +
                "myRV.layoutManager = LinearLayoutManager(this)\n"))
        items.add(Review(2,"ALERT DILOG","Alert Dialogs give us more flexibility by allowing us to use buttons and get user input in our alerts.","ALERT DILOG\n" +

                "  private fun customAlert(){\n" +
                "        // first we create a variable to hold an AlertDialog builder\n" +
                "        val dialogBuilder = AlertDialog.Builder(this)\n" +
                "        // then we set up the input\n" +
                "        // here we set the message of our alert dialog\n" +
                "        dialogBuilder.setMessage(//masage)\n" +
                "           \n" +
                "            .setPositiveButton(\"Submit\", DialogInterface.OnClickListener {\n" +
                "                    dialog, id -> //action here\n" +
                "            })\n" +
                "            .setNegativeButton(\"Cancel\", DialogInterface.OnClickListener {\n" +
                "                    dialog, id -> //action here\n" +
                "            })\n" +
                "        // create dialog box\n" +
                "        val alert = dialogBuilder.create()\n" +
                "        // set title \n" +
                "        alert.setTitle(\"New Message\")\n" +
                "        // add the Edit Text\n" +
                "        alert.setView(input)\n" +
                "        // show alert dialog\n" +
                "        alert.show()\n" +
                "    }    \n"))
        myRV.adapter!!.notifyDataSetChanged()

    }






}