package kz.study.lights

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        redButton.setOnClickListener {
            textView.text = getString(R.string.red)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor))
        }

        yellowButton.setOnClickListener {
            textView.text = getString(R.string.yellow)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
        }

        greenButton.setOnClickListener {
            textView.text = getString(R.string.green)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor))
        }
    }
}