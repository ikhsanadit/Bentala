package com.bangkit2022.bentala.onboard


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit2022.bentala.databinding.ActivityThirdBinding
import com.bangkit2022.bentala.MainActivity


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReady.setOnClickListener{
            callMainActivity()
        }
    }

    private fun callMainActivity(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}