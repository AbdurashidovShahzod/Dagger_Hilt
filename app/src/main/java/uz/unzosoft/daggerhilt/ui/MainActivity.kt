package uz.unzosoft.daggerhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import uz.unzosoft.daggerhilt.R
import uz.unzosoft.daggerhilt.databinding.ActivityMainBinding
import uz.unzosoft.daggerhilt.di.SomeClass
import uz.unzosoft.daggerhilt.di.module.SomeOtherClass
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    /***
     * Field injection
     */
    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        println(someClass.doAThing())
//        println(someClass.doSomeOther())
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.container, FirstFragment())
            .commit()
    }
}