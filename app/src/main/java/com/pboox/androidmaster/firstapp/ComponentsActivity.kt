package com.pboox.androidmaster.firstapp

import android.content.Context
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.pboox.androidmaster.R

class ComponentsActivity : AppCompatActivity() {

    private var isTempUpSelected: Boolean = true
    private var isTempDownSelected: Boolean = false
    private var currentTime: Int = 30

    private lateinit var tempUp: CardView
    private lateinit var tempDown: CardView
    private lateinit var tvTemp: TextView
    private lateinit var rsTemp: RangeSlider
    private lateinit var btnSubtract: FloatingActionButton
    private lateinit var btnPlus: FloatingActionButton
    private lateinit var tvTime: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_components)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponents()
        initListeners()
        initUi()

    }

    private fun initComponents() {
        tempUp = findViewById(R.id.tempUp)
        tempDown = findViewById(R.id.tempDown)
        tvTemp = findViewById(R.id.tvTemp)
        rsTemp = findViewById(R.id.rsTemp)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnPlus = findViewById(R.id.btnPlus)
        tvTime = findViewById(R.id.tvTime)
    }

    private fun initListeners() {
        tempUp.setOnClickListener {
            changeTempUp()
            setColor()
        }
        tempDown.setOnClickListener {
            changeTempDown()
            setColor()
        }
        rsTemp.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvTemp.text = result.toString()

        }

        btnPlus.setOnClickListener {
            currentTime += 1
            setTime()
        }
        btnSubtract.setOnClickListener {
            currentTime -= 1
            setTime()
        }
    }

    private fun setTime() {
        tvTime.text = currentTime.toString()
    }

    private fun changeTempUp(){
        isTempDownSelected = false
        if (isTempUpSelected) {
            isTempUpSelected = true
        }
        else {
            isTempUpSelected = true
        }
    }

    private fun changeTempDown() {
        isTempUpSelected = false
        if (isTempDownSelected) {
            isTempDownSelected = true
        }
        else {
            isTempDownSelected = true
        }
    }

    private fun setColor() {

        val tempUpColor = if(isTempUpSelected) {
            ContextCompat.getColor(this, R.color.background_component_selected)
        } else {
            ContextCompat.getColor(this, R.color.background_component)
        }

        tempUp.setCardBackgroundColor(tempUpColor)

        val tempDownColor = if(isTempDownSelected) {
            ContextCompat.getColor(this, R.color.background_component_selected)
        } else {
            ContextCompat.getColor(this, R.color.background_component)
        }

        tempDown.setCardBackgroundColor(tempDownColor)

//        tempUp.setCardBackgroundColor(getColor(isTempUpSelected))
//        tempDown.setCardBackgroundColor(getColor(isTempDownSelected))

    }

    private fun getColor(isSelected: Boolean): Int {
        val color = if (isSelected) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, color)
    }

    private fun initUi() {
        setColor()
        setTime()
    }

}