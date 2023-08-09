package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val key :String="keys ->"
  var counter :Int=0
  private var te: TextView = findViewById(R.id.obj)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(key, "onCreate: ")
        if (savedInstanceState != null) {
            counter=savedInstanceState.getInt(  "counter_key")
            counter++
            te.text = "${this.counter}"
            //Log.d(key, "onCreate: returnedValue= ${counter}")
            }


    }

    override fun onStart()
    {
      super.onStart()
        Log.d("key"," onStart: ")



    }

    override fun onResume()
    {
        super.onResume()

        Log.d(key," onResume: ")



    }


    override fun onPause()
    {
        super.onPause()

        Log.d(key," onPause: ")



    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    super.onRestoreInstanceState(savedInstanceState)

        Log.d(key," onRestoreInstanceState: ")

    }



    override fun onStop()
    {
        super.onStop()

        Log.d(key," onStop: ")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
         outState.putInt("counter_key",counter)


        Log.d(key," onSaveInstanceState: ")

    }



}
