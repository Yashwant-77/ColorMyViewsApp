package com.example.colormyviews

import android.R.color.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListner()
    }

    private fun setListner() {
        val clickableViews = listOf<View>(
            findViewById<TextView>(R.id.box_one_text),
            findViewById<TextView>(R.id.box_two_text),
            findViewById<TextView>(R.id.box_three_text),
            findViewById<TextView>(R.id.box_four_text),
            findViewById<TextView>(R.id.box_five_text),
            findViewById<TextView>(R.id.constraint_layout),
            findViewById<Button>(R.id.red_button),
            findViewById<Button>(R.id.yellow_button),
            findViewById<Button>(R.id.green_button)
        )


        for(item in clickableViews) {
            item.setOnClickListener{
                makeColored(it) }
        }

    }

    private fun makeColored(view: View) {

        when(view.id){
            //Box using color from color class
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Box using color from android color resources
            R.id.box_three_text-> view.setBackgroundColor(Color.RED)
            R.id.box_four_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_text-> view.setBackgroundColor(Color.YELLOW)

            R.id.red_button-> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(Color.GREEN)
            R.id.green_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(Color.YELLOW)
            R.id.yellow_button-> findViewById<TextView>(R.id.box_five_text).setBackgroundColor(Color.RED)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}