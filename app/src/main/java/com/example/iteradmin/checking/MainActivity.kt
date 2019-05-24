package com.example.iteradmin.checking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View) {
        val ch1=findViewById<CheckBox>(R.id.checkBox)
        val ch2=findViewById<CheckBox>(R.id.checkBox2)
        val ch3=findViewById<CheckBox>(R.id.checkBox3)
        val ch4=findViewById<CheckBox>(R.id.checkBox4)
          val id:Int=v.id
          when(id){
               R.id.checkBox ->{
                   val ch1=findViewById<CheckBox>(R.id.checkBox)
                   if(ch1.isChecked){
                       ch2.isChecked=false
                       ch3.isChecked=false
                       ch4.isChecked=false
                       toast(ch1.text.toString())
                   }

               }
              R.id.checkBox2 ->{
                  val ch2=findViewById<CheckBox>(R.id.checkBox2)
                  if(ch2.isChecked){
                      ch1.isChecked=false
                      ch3.isChecked=false
                      ch4.isChecked=false
                      toast(ch2.text.toString())
                  }

              }
              R.id.checkBox3 ->{
                  val ch3=findViewById<CheckBox>(R.id.checkBox3)
                  if(ch3.isChecked){
                      ch2.isChecked=false
                      ch1.isChecked=false
                      ch4.isChecked=false
                      toast(ch3.text.toString())
                  }

              }
              R.id.checkBox4 ->{
                  val ch4=findViewById<CheckBox>(R.id.checkBox4)
                  if(ch4.isChecked){
                      ch2.isChecked=false
                      ch3.isChecked=false
                      ch1.isChecked=false
                      toast(ch4.text.toString())
                  }

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
