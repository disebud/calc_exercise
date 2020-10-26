package com.example.KalkulatorBaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.math.RoundingMode
import java.text.DecimalFormat


class MainActivity : AppCompatActivity()
{

    val numbSatu: EditText = findViewById(R.id.et_satu)
    val numbDua: EditText = findViewById(R.id.et_dua)
    val resultText: TextView = findViewById(R.id.tv_result)

    var bilanganSatu = 0
    var bilanganDua = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlus: Button = findViewById(R.id.btn_plus)
        val btnMinus: Button = findViewById(R.id.btn_minus)
        val btnDiv: Button = findViewById(R.id.btn_div)
        val btnTimes: Button = findViewById(R.id.btn_times)
        val btnClear: Button = findViewById(R.id.btn_clear)

        btnPlus.setOnClickListener{plus()}
        btnMinus.setOnClickListener{minus()}
        btnDiv.setOnClickListener{div()}
        btnTimes.setOnClickListener{times()}
        btnClear.setOnClickListener{clear()}

    }

    private fun cek() : Boolean {
        if(numbSatu.text.toString().isNotEmpty() && numbDua.text.toString().isNotEmpty()){
          return  true
        } else {
            return false
        }

//        if(numbDua.text.toString().isNotEmpty()){
//            return  true
//        } else {
//            return false
//        }


    }

    private fun plus(){

        if(cek()){
            bilanganSatu = numbSatu.text.toString().toInt()
            bilanganDua = numbDua.text.toString().toInt()
            var hasil = bilanganSatu + bilanganDua
            resultText.text = hasil.toString()
            Toast.makeText(this,"maka ${bilanganSatu.toString()} + ${bilanganDua.toString()} = ${hasil.toString()}",
                Toast.LENGTH_SHORT).show()
        }

//        if(numbSatu.text.toString().isNotEmpty()){
//            bilanganSatu = numbSatu.text.toString().toInt()
//        }else if(numbDua.text.toString().isNotEmpty()){
//            bilanganDua = numbDua.text.toString().toInt()
//        }

//        var hasil = bilanganSatu + bilanganDua

//        resultText.text = hasil.toString()

//        Toast.makeText(this,"maka ${bilanganSatu.toString()} + ${bilanganDua.toString()} = ${hasil.toString()}",
//                Toast.LENGTH_SHORT).show()
    }

    private fun minus(){

        val numbSatu: EditText = findViewById(R.id.et_satu)
        val numbDua: EditText = findViewById(R.id.et_dua)
        val resultText: TextView = findViewById(R.id.tv_result)

        var bilanganSatu = 0
        var bilanganDua = 0

        if(numbSatu.text.toString().isNotEmpty()){
            bilanganSatu = numbSatu.text.toString().toInt()
        }else if(numbDua.text.toString().isNotEmpty()){
            bilanganDua = numbDua.text.toString().toInt()
        }

        var hasil = bilanganSatu - bilanganDua

        resultText.text = hasil.toString()

        Toast.makeText(this,"maka ${bilanganSatu.toString()} - ${bilanganDua.toString()} = ${hasil.toString()}",
                Toast.LENGTH_SHORT).show()
    }

    private fun times(){

        val numbSatu: EditText = findViewById(R.id.et_satu)
        val numbDua: EditText = findViewById(R.id.et_dua)
        val resultText: TextView = findViewById(R.id.tv_result)

        var bilanganSatu = 0
        var bilanganDua = 0

        if(numbSatu.text.toString().isNotEmpty()){
            bilanganSatu = numbSatu.text.toString().toInt()
        }else if(numbDua.text.toString().isNotEmpty()){
            bilanganDua = numbDua.text.toString().toInt()
        }

        var hasil = bilanganSatu * bilanganDua


        resultText.text = hasil.toString()

        Toast.makeText(this,"maka ${bilanganSatu.toString()} x ${bilanganDua.toString()} = ${hasil.toString()}",
                Toast.LENGTH_SHORT).show()
    }

    private fun div(){

        val numbSatu: EditText = findViewById(R.id.et_satu)
        val numbDua: EditText = findViewById(R.id.et_dua)
        val resultText: TextView = findViewById(R.id.tv_result)

        var bilanganSatu = 0
        var bilanganDua = 0

        if(numbSatu.text.toString().isNotEmpty()){
            bilanganSatu = numbSatu.text.toString().toInt()
        }else if(numbDua.text.toString().isNotEmpty()){
            bilanganDua = numbDua.text.toString().toInt()
        }

        val hasil : Double = bilanganSatu.toDouble() / bilanganDua.toDouble()
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING

        val final = df.format(hasil).toString()

        resultText.text = final

        Toast.makeText(this,"maka ${bilanganSatu.toString()} / ${bilanganDua.toString()} = ${hasil.toString()}",
                Toast.LENGTH_SHORT).show()
    }

    private fun clear(){

        val numbSatu: EditText = findViewById(R.id.et_satu)
        val numbDua: EditText = findViewById(R.id.et_dua)
        val resultText: TextView = findViewById(R.id.tv_result)

        numbSatu.text.clear();
        numbDua.text.clear();
        resultText.text = "0"

        Toast.makeText(this,"clear",
                Toast.LENGTH_SHORT).show()
    }

}


