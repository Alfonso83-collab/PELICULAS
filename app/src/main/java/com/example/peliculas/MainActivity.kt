package com.example.peliculas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.android.volley.Request


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nombre: String? = getIntent().getStringExtra("id")
        get("http://itsnamovil-001-site1.btempurl.com/apimovies?title=cars")
    }
    private fun get(url:String) {
        var queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, url, Response.Listener<String> { response ->
            // Display the first 500 characters of the response string.
            //var img = findViewById<ImageView>(R.id.img)
            val gson = Gson()
            val peli = gson.fromJson(response, Peliculas::class.java)
            println("Titulo: ${peli.Title} ${peli.Poster?.Uri}.${peli.Poster?.Extension}")

            //findViewById<TextView>(R.id.name).setText(peli.Title)
            // en el ImageView
           // Picasso.get()
                    //.load("${peli.Poster?.Uri}.${peli.Poster?.Extension}")
                   // .into(img)
        }, Response.ErrorListener { println("That didn't work!")
        })
        queue.add(stringRequest)
    }
}