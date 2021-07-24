package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener() {

            //direct access inner software

            //val intent : Intent = Intent(this,AboutActivity::class.java)

            //direct access outer software

            //val geo = Uri.parse("geo: 3.1390, 101.6869")
            //val intent : Intent = Intent(Intent.ACTION_VIEW,geo)

            //multiple option for access outer software

            //val intent = Intent(Intent.ACTION_SEND)
            //intent.setType("text/plain")
            //intent.putExtra(Intent.EXTRA_TEXT, "hello")

            //try access and use the phone call
            val tel = Uri.parse("tel:0126622128")
            val intent : Intent = Intent(Intent.ACTION_DIAL, tel)

            startActivity(intent)

        }
    }
}