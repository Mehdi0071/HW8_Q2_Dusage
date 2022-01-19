package com.example.q2_dusage

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.core.graphics.drawable.toDrawable

/*
3  2  1
6  5  4
9  8  7        */
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val winConcepts = listOf<Set<String>>(setOf("1","2","3"),setOf("4","5","6"), setOf("7","8","9"), setOf("1","4","7"), setOf("2","5","8"), setOf("3","6","9"), setOf("1","5","9"),setOf("3","5","7"))
        var playerx = ""
        var playero = ""

        val textView = findViewById<TextView>(R.id.textView)

        val button1 = findViewById<AppCompatButton>(R.id.appCompatButton)
        val button2 = findViewById<AppCompatButton>(R.id.appCompatButton2)
        val button3 = findViewById<AppCompatButton>(R.id.appCompatButton3)
        val button4 = findViewById<AppCompatButton>(R.id.appCompatButton4)
        val button5 = findViewById<AppCompatButton>(R.id.appCompatButton5)
        val button6 = findViewById<AppCompatButton>(R.id.appCompatButton6)
        val button7 = findViewById<AppCompatButton>(R.id.appCompatButton10)
        val button8 = findViewById<AppCompatButton>(R.id.appCompatButton8)
        val button9 = findViewById<AppCompatButton>(R.id.appCompatButton9)

        val resetBtn = findViewById<AppCompatButton>(R.id.reset)

        var player = -1 //player x is -1 and player O is 1

        button1.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "1"
            } else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "1"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button2.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "2"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "2"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button3.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "3"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "3"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button4.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "4"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "4"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button5.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "5"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "5"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button6.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "6"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "6"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button7.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "7"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "7"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

        button8.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "8"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "8"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }



        }

        button9.setOnClickListener {

            if (player == -1) {
                it.setBackgroundResource(R.drawable.x_300_300)
                playerx += "9"
            }
            else {
                it.setBackgroundResource(R.drawable.o_300_300)
                playero += "9"
            }
            player *= -1
            it.isEnabled = false

            loop@for (win in winConcepts) {
                var count = 0
                for (Px in playerx) {
                    if (win.contains("$Px"))
                        count++
                    if (count == 3) {
                        textView.setText("Player X Won")
                        break@loop
                    }
                }
                count = 0
                for (Po in playero){
                    if (win.contains("$Po"))
                        count++
                    if (count == 3) {
                        textView.setText("Player O Won")
                        break@loop
                    }
                }
            }

        }

            resetBtn.setOnClickListener {

                playerx = "" ; playero = "" ; player = -1

                button1.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button2.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button3.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button4.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button5.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button6.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button7.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button8.run { isEnabled = true ; setBackgroundResource(R.color.pink) }
                button9.run { isEnabled = true ; setBackgroundResource(R.color.pink) }

                textView.setText("Draw")

            }

            fun AppCompatButton.disableButtons() {
            button1.isEnabled = false ; button2.isEnabled = false ; button3.isEnabled = false
            button4.isEnabled = false ; button5.isEnabled = false ; button6.isEnabled = false
            button7.isEnabled = false ; button8.isEnabled = false ; button9.isEnabled = false
        }
    }
}