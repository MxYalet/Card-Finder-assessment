package com.example.cardinfofinder.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cardinfofinder.data.model.BankResponse
import com.example.cardinfofinder.data.repository.Repository
import com.example.cardinfofinder.utils.ValidationHelper
import kotlinx.coroutines.launch
import javax.inject.Inject


class MainActivityViewModel
@Inject constructor(private val repository: Repository): ViewModel(){


    private val _observeGetData = MutableLiveData<BankResponse?>()
    val observeGetData: MutableLiveData<BankResponse?> = _observeGetData


   /* fun fetchBinDetails(bin: String) {
        viewModelScope.launch {
            try {
                if (bin.isEmpty()) {
                    _observeGetData.value = null
                    return@launch
                }
                val binDetails = repository.fetchBinDetails(bin)
                _observeGetData.value = binDetails
            } catch (e: Exception) {
                _observeGetData.value = null
            }
        }
    }*/
}
