package uz.elmurod.lesson70_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private var firstBtn: MaterialButton? = null
    var secondBtn: MaterialButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBtn = findViewById(R.id.first)
        secondBtn = findViewById(R.id.second)

        firstBtn?.setOnClickListener {
            replaceToFragment(FirstFragment())
        }
        secondBtn?.setOnClickListener {
            replaceToFragment(SecondFragment())
        }

    }

    private fun replaceToFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }


}