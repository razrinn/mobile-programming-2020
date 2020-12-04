package id.ac.ui.cs.mobileprogramming.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.character_list_fragment, CharacterListFragment()).commit()
//        val btnClickMe = findViewById<Button>(R.id.button)
//        btnClickMe.setOnClickListener {
//            // make a toast on button click event
//            Toast.makeText(this, "Downloaded 4GB RAM", Toast.LENGTH_LONG).show()
//        }
//        val btnClickTimerActivity = findViewById<Button>(R.id.button2)
//        btnClickTimerActivity.setOnClickListener {
//            navigateToTimerActivity()
//        }
    }

//    override fun onBackPressed() {
//        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed()
//            return
//        }
//        this.doubleBackToExitPressedOnce = true
//        Toast.makeText(this, "Back again to exit", Toast.LENGTH_SHORT).show()
//        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
//    }

    private fun navigateToTimerActivity(){
        val intent = Intent(this, TimerActivity::class.java).apply {
        }
        startActivity(intent)
    }
}