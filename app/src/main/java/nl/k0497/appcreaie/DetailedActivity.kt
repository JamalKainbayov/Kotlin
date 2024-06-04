package nl.k0497.appcreaie

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)


        val foodName = intent.getStringExtra("foodName")
        val foodImage = intent.getIntExtra("foodImage", 0)

        if (foodName != null) {
            val textView: TextView = findViewById(R.id.tvDetailed)
            val imageView: ImageView = findViewById(R.id.ivDetailed)

            textView.text = foodName
            imageView.setImageResource(foodImage)
        }
    }
}