package lecture.part2.ch3.ex3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Button)
        button.setOnClickListener {
            val intent = Intent()
            intent.action = "ACTION_DETAIL"
            intent.data = Uri.parse("http://www.google.com")
            startActivity(intent)
        }
    }
}