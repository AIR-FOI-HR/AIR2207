package hr.foi.air.eventscheduler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        //if login button is pressed opens up login
        val goToLogin = findViewById<Button>(R.id.landingPageLoginButton)
        goToLogin.setOnClickListener{
            val intent = Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }

        //if register button is pressed opens up register
        val goToRegister = findViewById<Button>(R.id.landingPageRegisterButton)
        goToRegister.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        //if guest button is pressed opens up main
        val guestButton = findViewById<Button>(R.id.landingPageGuestButton)
        guestButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}