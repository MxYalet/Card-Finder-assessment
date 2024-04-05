package com.example.cardinfofinder.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cardinfofinder.R
import com.example.cardinfofinder.data.model.BankDetails
import com.example.cardinfofinder.data.model.BankResponse
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CardDetailsFragment(private val bankResponse: BankResponse) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_card_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateUI(bankResponse)
    }

    private fun updateUI(binDetails: BankResponse) {
        view?.apply {
            findViewById<TextView>(R.id.card_brand)?.text = binDetails.scheme
            findViewById<TextView>(R.id.card_bank_name)?.text = binDetails.bank.name
            findViewById<TextView>(R.id.card_type)?.text = binDetails.type
            findViewById<TextView>(R.id.tv_card_exp_date)?.text = binDetails.country.name
        }
    }
}
