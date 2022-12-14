package hr.foi.air.eventscheduler
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import hr.foi.air.eventscheduler.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(News())


        binding.nav.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.News -> replaceFragment(News())
                R.id.Artists -> replaceFragment(Artists())
                R.id.info -> replaceFragment(Info())
                R.id.Settings -> replaceFragment(Settings())
                R.id.Timetable -> replaceFragment(Timetable())
                else -> {

                }
            }
            true

        }

    }
    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}