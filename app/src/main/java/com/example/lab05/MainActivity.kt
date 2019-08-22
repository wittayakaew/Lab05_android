package com.example.lab05

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.lab05.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
        var car1:CarList = CarList("","","")
        var car2:CarList = CarList("","","")
        var car3:CarList = CarList("","","")

    var slot = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding.apply {
//            if(car1?.name.equals("")){
//                buttonSlot1.setBackgroundColor(Color.parseColor("#A3E4D7"))
//            }else{
//                buttonSlot1.setBackgroundColor(Color.parseColor("#F1948A"))
//            }
//        }
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


            binding.buttonSlot1.setOnClickListener(){
                slot = 1
                showview(it)



            }
            binding.buttonSlot2.setOnClickListener(){
                slot = 2
                showview(it)

            }
            binding.buttonSlot3.setOnClickListener(){
                slot = 3
                showview(it)





            }
        binding.deleteButton.setOnClickListener(){
            deleteData(it)
        }
        binding.editButton.setOnClickListener(

        ){
            updataData(it)
        }
        binding.car1 = this@MainActivity.car1
        binding.car2 = this@MainActivity.car2
        binding.car3 = this@MainActivity.car3



    }
    private fun showview(view: View){
        binding.apply {


            if (slot==1){
                textView8.text = car1?.name
                textView9.text = car1?.classcar
                textView10.text = car1?.number

                textView8.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE


                nameText.visibility = View.GONE
                classText.visibility = View.GONE
                numText.visibility = View.GONE

            }else if (slot ==2){
                textView8.text = car2?.name
                textView9.text = car2?.classcar
                textView10.text = car2?.number

                textView8.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE


                nameText.visibility = View.GONE
                classText.visibility = View.GONE
                numText.visibility = View.GONE
            }else{
                textView8.text = car3?.name
                textView9.text = car3?.classcar
                textView10.text = car3?.number

                textView8.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE


                nameText.visibility = View.GONE
                classText.visibility = View.GONE
                numText.visibility = View.GONE
            }
            textView11.text = "Slot : "+slot.toString()
    invalidateAll()
        }


    }

    private fun deleteData(view: View){
        binding.apply {
        if (slot==1){
            textView8.visibility = View.GONE
            textView10.visibility = View.GONE
            textView9.visibility = View.GONE


            nameText.visibility = View.VISIBLE
            classText.visibility = View.VISIBLE
            numText.visibility = View.VISIBLE

            nameText.setText("")
            classText.setText("")
            numText.setText("")

            car1?.name = ""
            car1?.classcar = ""
            car1?.number = ""
            buttonSlot1.setBackgroundColor(Color.parseColor("#A3E4D7"))
        }else if (slot ==2){
            textView8.visibility = View.GONE
            textView10.visibility = View.GONE
            textView9.visibility = View.GONE


            nameText.visibility = View.VISIBLE
            classText.visibility = View.VISIBLE
            numText.visibility = View.VISIBLE

            car2?.name = ""
            car2?.classcar = ""
            car2?.number = ""
            buttonSlot2.setBackgroundColor(Color.parseColor("#A3E4D7"))
        }else{
            textView8.visibility = View.GONE
            textView10.visibility = View.GONE
            textView9.visibility = View.GONE


            nameText.visibility = View.VISIBLE
            classText.visibility = View.VISIBLE
            numText.visibility = View.VISIBLE

            car3?.name = ""
            car3?.classcar = ""
            car3?.number = ""
            buttonSlot3.setBackgroundColor(Color.parseColor("#A3E4D7"))
        }

            invalidateAll()

    }
    }


    private fun updataData(view:View){
       binding.apply {
           if (slot==1){

               nameText.visibility = View.VISIBLE
               classText.visibility = View.VISIBLE
               numText.visibility = View.VISIBLE
               textView8.visibility = View.GONE
               textView10.visibility = View.GONE
               textView9.visibility = View.GONE

               car1?.name = nameText.text.toString()
               car1?.classcar = classText.text.toString()
               car1?.number =numText.text.toString()
               buttonSlot1.setBackgroundColor(Color.parseColor("#F1948A"))

           }else if (slot ==2){
               nameText.visibility = View.VISIBLE
               classText.visibility = View.VISIBLE
               numText.visibility = View.VISIBLE
               textView8.visibility = View.GONE
               textView10.visibility = View.GONE
               textView9.visibility = View.GONE
               car2?.name = nameText.text.toString()
               car2?.classcar = classText.text.toString()
               car2?.number =numText.text.toString()
               buttonSlot2.setBackgroundColor(Color.parseColor("#F1948A"))
           }else if (slot == 3){
               nameText.visibility = View.VISIBLE
               classText.visibility = View.VISIBLE
               numText.visibility = View.VISIBLE
               textView8.visibility = View.GONE
               textView10.visibility = View.GONE
               textView9.visibility = View.GONE
               car3?.name = nameText.text.toString()
               car3?.classcar = classText.text.toString()
               car3?.number =numText.text.toString()
               buttonSlot3.setBackgroundColor(Color.parseColor("#F1948A"))
           }
           invalidateAll()
       }
    }


    }





