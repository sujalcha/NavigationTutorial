package com.xtha.zujal.navigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

class DestinationTwo : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController(view)
        view.findViewById<Button>(R.id.buttondestination21).setOnClickListener(this)
        view.findViewById<Button>(R.id.buttondestination22).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.buttondestination21 -> navController!!.navigate(R.id.action_destinationTwo_to_destinationTwoOne)
            R.id.buttondestination22 -> navController!!.navigate(R.id.action_destinationTwo_to_destinationTwoTwo)
        }
    }


}