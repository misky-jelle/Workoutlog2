package dev.Misky.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.Misky.workoutlog.databinding.ActivityHomeBinding
import dev.Misky.workoutlog.databinding.ActivityLogInBinding

class logInActivity : AppCompatActivity() {
    lateinit var binding:ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
    }
    fun castViews() {

        binding.tvSignup.setOnClickListener {
            val intent=Intent(this,signupActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogIn.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)

            validateLogin()
        }

    }
    fun validateLogin(){
        var email=binding.etEmail.text.toString()
        var password=binding.etpassword.text.toString()
        if (email.isBlank()){
            binding.tilEmail.error="Email is required"
        }
        if (password.isBlank()){
            binding.tilpassword.error="Password is required"
        }
    }
}
