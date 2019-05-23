package com.example.iteradmin.checking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View) {
          val id:Int=v.id
          when(id){
              R.id.checkBox ->
              {
                 val s:String=findViewById<CheckBox>(R.id.checkBox).text.toString()
                  toast(s)
              }
              R.id.checkBox2 ->{
                  val s:String=findViewById<CheckBox>(R.id.checkBox2).text.toString()
                  toast(s)
               }
              R.id.checkBox3 ->{
                  val s:String=findViewById<CheckBox>(R.id.checkBox3).text.toString()
                  toast(s)
              }
              R.id.checkBox4 ->{
                  val s:String=findViewById<CheckBox>(R.id.checkBox4).text.toString()
                  toast(s)
              }
          }
    }
    fun toast(message: String)
    {
        Toast.makeText(applicationContext,message+"will be the PM",Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ch1=findViewById<CheckBox>(R.id.checkBox)
        val ch2=findViewById<CheckBox>(R.id.checkBox2)
        val ch3=findViewById<CheckBox>(R.id.checkBox3)
        val ch4=findViewById<CheckBox>(R.id.checkBox4)

        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        ch3.setOnClickListener(this)
        ch4.setOnClickListener(this)
    }
}
