package com.xtha.zujal.navigationtutorial

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

class DestinationTwoOne : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController
    private lateinit var editTextTextPersonName : EditText
    private lateinit var PersonNamestr : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination_two_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController(view)
        view.findViewById<Button>(R.id.buttondestination211).setOnClickListener(this)
        editTextTextPersonName = view.findViewById<EditText>(R.id.editTextTextPersonName)

    }

    override fun onClick(v: View?) {
        when (v!!.id)
        {
            R.id.buttondestination211 ->
                //PersonNamestr = editTextTextPersonName.text.toString()
            if(!TextUtils.isEmpty(editTextTextPersonName.text.toString())) {
                val bundle = bundleOf("recipient" to editTextTextPersonName.text.toString())
                Toast.makeText(activity, "Name Not Empty", Toast.LENGTH_SHORT).show()
                navController!!.navigate(
                    R.id.action_destinationTwoOne_to_destinationTwoOneOne,
                    bundle
                )
            }
                else{
                Toast.makeText(activity, "Enter a name", Toast.LENGTH_SHORT).show()
            }


        }
    }


}