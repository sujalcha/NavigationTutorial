package com.xtha.zujal.navigationtutorial

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation


class DestinationTwoOneOne : Fragment(), View.OnClickListener {
    private lateinit var navController: NavController
    private lateinit var amount: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination_two_one_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.buttondestination2111).setOnClickListener(this)
        val tv = view.findViewById<TextView>(R.id.textViewCustomerName)
        tv.text = arguments?.getString("recipient")
        amount = view.findViewById<EditText>(R.id.editTextAmount)

    }

    override fun onClick(v: View?) {
        when (v!!.id)
        {
            R.id.buttondestination2111 ->
                if(!TextUtils.isEmpty(amount.text.toString())) {

                    val bundle = bundleOf(
                        "recipient" to arguments?.getString("recipient"),
                        "amount" to amount.text.toString()
                    )

                    Toast.makeText(activity, "Amount Not Empty", Toast.LENGTH_SHORT).show()
                    navController!!.navigate(
                        R.id.action_destinationTwoOneOne_to_destinationTwoOneOneOne,
                        bundle
                    )
                }
                else{
                    Toast.makeText(activity, "Enter Amount", Toast.LENGTH_SHORT).show()
                }
        }


    }

}