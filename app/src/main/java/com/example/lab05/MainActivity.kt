package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.lab05.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var car1 = CarList("1","1","1")
    private var car2 = CarList("2","2","2")
    private var car3 = CarList("3","3","3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            buttonSlot1.setOnClickListener(){
                updateNameCar(it)
            }
            editButton.setOnClickListener(){
                deleteData(it)
            }
        }

    }

    private fun updateNameCar(view: View){
        binding.apply {
        nameSet.text = nameText.text
            nameText.visibility = View.GONE
            nameSet.visibility = View.VISIBLE

        }
    }

    private fun deleteData(view: View){
        binding.apply {
            nameSet.text = ""
            nameText.visibility = View.VISIBLE
            nameSet.visibility = View.GONE

        }
    }




}
