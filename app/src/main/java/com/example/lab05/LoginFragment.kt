package com.example.lab05


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab05.databinding.FragmentLoginBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFragment : Fragment() {
    private lateinit var binding : FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        binding.apply {
            button.setOnClickListener{ view ->
                if(usernaemEdit.text.toString().equals("admin")){
                    if (passwordEdit.text.toString().equals("1234")){
                        view.findNavController().navigate(R.id.action_loginFragment_to_carParkFragment)
                    }else{

                    }
                }


            }
            button2.setOnClickListener{
                view ->
                usernaemEdit.setText("")
                passwordEdit.setText("")
            }
        }

        return binding.root
    }


}
