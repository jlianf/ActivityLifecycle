package com.jalian.activitylifecyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonNextPage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("1", "Page 1 onCreate")
        buttonNextPage = findViewById(R.id.button_NextPage)
        buttonNextPage.setOnClickListener(this)
    }

    override fun onClick(v : View?){
        when(v?.id){
            R.id.button_NextPage ->{
                val intent = Intent(this, SecoundActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("1", "Page 1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("1", "Page 1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("1", "Page 1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("1", "Page 1 onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("1", "Page 1 onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("1", "Page 1 onDestroy")
    }
}