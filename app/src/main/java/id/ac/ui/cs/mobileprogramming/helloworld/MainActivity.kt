package id.ac.ui.cs.mobileprogramming.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.button)

        btnClickMe.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(
                this,
                capitalizeText("Berhasil mendownload RAM sebesar 16GB. Handphone menjadi 80% lebih cepat"),
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private external fun capitalizeText(text: String): String

    companion object {
        init {
            System.loadLibrary("native-fun")
        }
    }
}