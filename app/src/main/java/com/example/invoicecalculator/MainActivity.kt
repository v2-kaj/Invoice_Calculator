package com.example.invoicecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.invoicecalculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateInvoice() }
    }
    fun calculateInvoice(){
        val amount= binding.dailyRate.text.toString().toDouble() * binding.dailyRate.text.toString().toDouble()
        val formattedAmount = NumberFormat.getCurrencyInstance().format(amount.toString().toDouble())
        binding.invoiceAmount.text=getString(R.string.invoice_amount_is, formattedAmount)
    }
}
