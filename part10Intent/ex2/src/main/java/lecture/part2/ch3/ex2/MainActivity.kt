package lecture.part2.ch3.ex2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_list)
        val datas = arrayOf<String>("android", "kotlin", "jetpack")
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            datas
        )
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", i)
            intent.putExtra("title", datas[i])
            startActivity(intent)
        }
    }
}