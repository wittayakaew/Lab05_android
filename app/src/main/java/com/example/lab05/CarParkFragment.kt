package com.example.lab05


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.lab05.databinding.FragmentCarParkBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CarParkFragment : Fragment() {

    var car1: CarList = CarList("", "", "")
    var car2: CarList = CarList("", "", "")
    var car3: CarList = CarList("", "", "")

    var slot = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCarParkBinding>(inflater, R.layout.fragment_car_park,
            container, false)

        binding.buttonSlot1.setOnClickListener(){
            slot = 1
            showview(it,binding)



            }
            binding.buttonSlot2.setOnClickListener(){
                slot = 2
                showview(it,binding)

            }
            binding.buttonSlot3.setOnClickListener(){
                slot = 3
                showview(it,binding)





            }
        binding.deleteButton.setOnClickListener(){
            deleteData(it, binding)
        }
        binding.editButton.setOnClickListener(

        ){
            updataData(it,binding)
        }
        binding.car1 = this@CarParkFragment.car1
        binding.car2 = this@CarParkFragment.car2
        binding.car3 = this@CarParkFragment.car3
        return binding.root
    }

    private fun showview(view:View,binding: FragmentCarParkBinding) {
        binding.apply {


            if (slot == 1) {
                textView8.text = car1?.name
                textView9.text = car1?.classcar
                textView10.text = car1?.number

                textView8.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE


                nameText.visibility = View.GONE
                classText.visibility = View.GONE
                numText.visibility = View.GONE

            } else if (slot == 2) {
                textView8.text = car2?.name
                textView9.text = car2?.classcar
                textView10.text = car2?.number

                textView8.visibility = View.VISIBLE
                textView10.visibility = View.VISIBLE
                textView9.visibility = View.VISIBLE


                nameText.visibility = View.GONE
                classText.visibility = View.GONE
                numText.visibility = View.GONE
            } else {
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
            textView11.text = "Slot : " + slot.toString()
            invalidateAll()
        }


    }

    private fun deleteData(view:View,binding: FragmentCarParkBinding) {
        binding.apply {
            if (slot == 1) {
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
            } else if (slot == 2) {
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
            } else {
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


    private fun updataData(view:View,binding: FragmentCarParkBinding) {
        binding.apply {
            if (slot == 1) {

                nameText.visibility = View.VISIBLE
                classText.visibility = View.VISIBLE
                numText.visibility = View.VISIBLE
                textView8.visibility = View.GONE
                textView10.visibility = View.GONE
                textView9.visibility = View.GONE

                car1?.name = nameText.text.toString()
                car1?.classcar = classText.text.toString()
                car1?.number = numText.text.toString()
                buttonSlot1.setBackgroundColor(Color.parseColor("#F1948A"))

            } else if (slot == 2) {
                nameText.visibility = View.VISIBLE
                classText.visibility = View.VISIBLE
                numText.visibility = View.VISIBLE
                textView8.visibility = View.GONE
                textView10.visibility = View.GONE
                textView9.visibility = View.GONE
                car2?.name = nameText.text.toString()
                car2?.classcar = classText.text.toString()
                car2?.number = numText.text.toString()
                buttonSlot2.setBackgroundColor(Color.parseColor("#F1948A"))
            } else if (slot == 3) {
                nameText.visibility = View.VISIBLE
                classText.visibility = View.VISIBLE
                numText.visibility = View.VISIBLE
                textView8.visibility = View.GONE
                textView10.visibility = View.GONE
                textView9.visibility = View.GONE
                car3?.name = nameText.text.toString()
                car3?.classcar = classText.text.toString()
                car3?.number = numText.text.toString()
                buttonSlot3.setBackgroundColor(Color.parseColor("#F1948A"))
            }
            invalidateAll()
        }
    }
}



