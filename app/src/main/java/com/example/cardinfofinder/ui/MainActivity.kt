package com.example.cardinfofinder.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.navigation.Navigation.findNavController
import com.example.cardinfofinder.R
import com.example.cardinfofinder.data.model.BankResponse
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainActivityViewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binEditText: EditText = findViewById(R.id.et_number)
        val loginButton: Button = findViewById(R.id.btn_login)

        val fragmentManager = supportFragmentManager

        loginButton.setOnClickListener {
            val cardNumber = binEditText.text.toString()
        //    mainActivityViewModel.fetchBinDetails(cardNumber)
        }
        mainActivityViewModel.observeGetData.observe(this, Observer { binDetails ->
            binDetails?.let {
                val fragment = CardDetailsFragment(it)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, fragment)
                    .addToBackStack(null)
                    .commit()


            }
        })
    }
}






