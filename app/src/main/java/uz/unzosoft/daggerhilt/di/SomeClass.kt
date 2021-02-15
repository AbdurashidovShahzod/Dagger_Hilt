package uz.unzosoft.daggerhilt.di

import android.content.Context
import com.google.gson.Gson
import uz.unzosoft.daggerhilt.di.module.ISecondDependency
import uz.unzosoft.daggerhilt.di.module.SecondDependencyInterface
import uz.unzosoft.daggerhilt.di.module.SomeDependency
import uz.unzosoft.daggerhilt.di.module.SomeOtherClass
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeClass @Inject constructor(
    private val someOtherClass: SomeOtherClass,
    private val iSecondDependency: SecondDependencyInterface,
    private val gson: Gson,
    private val context: Context
) {
    fun doAThing(): String = "Look I got : ${iSecondDependency.getSecond()}"

    fun doSomeOther(): String {
        return someOtherClass.doAThing()
    }
}