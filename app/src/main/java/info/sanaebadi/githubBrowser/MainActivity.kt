package info.sanaebadi.githubBrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.dependecyinjection.R
import info.sanaebadi.homescreen.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.screen_container , HomeFragment())
                .commit()
        }
    }
}