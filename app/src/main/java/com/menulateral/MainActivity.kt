package com.menulateral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar("Mi menú")
        init()

    }

    private fun init() {
        navView.setNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.item1 -> {
                    Log.i("OP1", "Opción 1")
                    Toast.makeText(applicationContext, "Opcion 1", Toast.LENGTH_LONG)
                }
                R.id.item2 -> {
                    Log.i("OP2", "Opción 2")
                    Toast.makeText(applicationContext, "Opcion 2", Toast.LENGTH_LONG)
                }
                R.id.item3 -> {
                    Log.i("OP3", "Opción 3")
                    Toast.makeText(applicationContext, "Opcion 3", Toast.LENGTH_LONG)
                }
                R.id.item4 -> {
                    Log.i("OP4", "Opción 4")
                    Toast.makeText(applicationContext, "Opcion 4", Toast.LENGTH_LONG)
                }
            }

            false
        }
    }

    fun toolbar(title: String){

        setSupportActionBar(toolbar)
        var ab = supportActionBar

        if(ab!=null){
            ab.setHomeAsUpIndicator(R.drawable.ic_menu)
            ab.setDisplayHomeAsUpEnabled(true)
            ab.title = title
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
            }

        }

        return super.onOptionsItemSelected(item)
    }


}