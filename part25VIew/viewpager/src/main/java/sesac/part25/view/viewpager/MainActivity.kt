package sesac.part25.view.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sesac.part25.view.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = MyAdapter(this)
    }
}