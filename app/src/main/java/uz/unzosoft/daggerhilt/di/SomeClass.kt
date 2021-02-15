package uz.unzosoft.daggerhilt.di

import uz.unzosoft.daggerhilt.di.module.SomeOtherClass
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeClass @Inject constructor(private val someOtherClass: SomeOtherClass) {
    fun doAThing() = "Look I did a thing!!!"

    fun doSomeOther(): String {
        return someOtherClass.doAThing()
    }
}