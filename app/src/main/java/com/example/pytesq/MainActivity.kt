package com.example.pytesq

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView10 = findViewById<TextView>(R.id.textView10)
var button = findViewById<TextView>(R.id.button)
        var textView8 = findViewById<TextView>(R.id.textView8)
var textView9 = findViewById<TextView>(R.id.textView9)
        var textView7 = findViewById<TextView>(R.id.textView7)
        var textView2 = findViewById<TextView>(R.id.cena1)







        //var cena_za_killogram = cena / mass * 1000








        /*var cena_za_killogram1 = cena1 / mass1 * 1000

        if (cena_za_killogram < cena_za_killogram1) {

        } else {

        }
        textView8.text = cena_za_killogram.toString()
        textView8.text = cena_za_killogram1.toString()*/

    button.setOnClickListener{
              val cena = cena10.text
              val cena1 = cena20.text
              val mass = mass10.text
              val mass1 = mass20.text
              val Calculationx = Calculation(cena.toString().toDouble(),cena1.toString().toDouble(),mass1.toString().toDouble(),mass1.toString().toDouble())
              textView8.text = Calculationx.Calculation1().toString()


              textView9.text =  Calculationx.returnx().toString()
              textView7.text = Calculationx.returnx1().toString()
          }



    }

}



class Calculation(val cena:Double, val cena1:Double, val mass:Double, val mass1:Double) {

    fun  Calculation1():Double {
        var cena_za_killogram1 = cena1 / mass1 * 1000
        var cena_za_killogram = cena / mass * 1000
        if (cena_za_killogram < cena_za_killogram1) {
           return  cena_za_killogram
        } else
          return cena_za_killogram1
    }

    fun returnx():Double{

        var cena_za_killogram = cena!! / mass * 1000
    return cena_za_killogram
    }

    fun returnx1():Double{

        var cena_za_killogram1 = cena1!! / mass1 * 1000
        return cena_za_killogram1
    }
}