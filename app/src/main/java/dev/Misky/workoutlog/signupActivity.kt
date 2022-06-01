package dev.Misky.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.Misky.workoutlog.databinding.ActivityLogInBinding
import dev.Misky.workoutlog.databinding.ActivitySignupBinding

class signupActivity : AppCompatActivity() {
  lateinit var binding:ActivitySignupBinding
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= ActivitySignupBinding.inflate(layoutInflater)
      setContentView(binding.root)
      castViews()
  }
    fun castViews() {

        binding.tvlogin.setOnClickListener {
            val intent=Intent(this,logInActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignup.setOnClickListener {
            validateLogin()
        }

    }
    fun validateLogin(){
        var first=binding.etfirstname.text.toString()
        var passWORD=binding.etpassword.text.toString()
        var second=binding.etsecondname.text.toString()
        var confirm=binding.etpassword.text.toString()

        if (first.isBlank()){
            binding.tilfirstname.error="Email is required"
        }
        if (second.isBlank()){
            binding.tilsecondname.error="Password is required"
        }
        if (confirm.isBlank()){
            binding.tilconfirm.error="Email is required"
        }
        if (passWORD.isBlank()){
            binding.tilPASSWORD.error="Password is required"
        }
    }
}
