package com.example.deepakkumarassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val y=findViewById<TextView>(R.id.yel)
var v=findViewById<TextView>(R.id.vio)
var g=findViewById<TextView>(R.id.gre)
        var c=findViewById<TextView>(R.id.col)
y.setOnClickListener {

c.text="Yellow colour button is clicked"
}
        v.setOnClickListener {

            c.text="Violet colour button is clicked"
        }
        g.setOnClickListener {

            c.text="Green colour button is clicked"
        }
    }
}