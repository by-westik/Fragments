package otus.gpb.homework.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_to_first)?.setOnClickListener {
            startActivity(Intent(this, FirstTaskActivity::class.java))
        }

        findViewById<Button>(R.id.button_to_second)?.setOnClickListener {
            startActivity(Intent(this, SecondTaskActivity::class.java))
        }

    }
}