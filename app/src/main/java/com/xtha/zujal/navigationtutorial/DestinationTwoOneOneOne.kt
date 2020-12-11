package com.xtha.zujal.navigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation


class DestinationTwoOneOneOne : Fragment(), View.OnClickListener {
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination_two_one_one_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val fulldetails = view.findViewById<TextView>(R.id.textViewfulldetails)
        fulldetails.text = arguments?.getString("amount")
        val name = view.findViewById<TextView>(R.id.textViewCustomer)
        name.text = arguments?.getString("recipient")
    }

    override fun onClick(v: View?) {
        when (v!!.id)
        {

        }
    }

}