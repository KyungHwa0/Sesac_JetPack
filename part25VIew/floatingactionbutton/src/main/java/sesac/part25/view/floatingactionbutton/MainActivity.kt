package sesac.part25.view.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sesac.part25.view.floatingactionbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            when(binding.fab.isExtended){
                true -> binding.fab.shrink()
                false -> binding.fab.extend()
            }
        }
    }
}