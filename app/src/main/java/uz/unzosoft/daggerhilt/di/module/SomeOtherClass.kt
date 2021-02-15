package uz.unzosoft.daggerhilt.di.module

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeOtherClass @Inject constructor() {
    fun doAThing() = "Some other class...!!!"
}