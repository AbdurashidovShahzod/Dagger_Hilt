package uz.unzosoft.daggerhilt.di

import android.content.Context
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import uz.unzosoft.daggerhilt.di.component.Impl1
import uz.unzosoft.daggerhilt.di.component.Impl2
import uz.unzosoft.daggerhilt.di.module.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeClass @Inject constructor(
    private val someOtherClass: SomeOtherClass,

    private val iSecondDependencyA: ISecondDependencyA,
    private val iSecondDependencyB: ISecondDependencyB,
    private val iSecondDependency: SecondDependencyInterface,
    private val gson: Gson

) {
    fun doAThing(): String = "Look I got : ${iSecondDependency.getSecond()}"

    fun secondDependencyA(): String = "iSecondDependencyA => ${iSecondDependencyA.getSecond()}"
    fun secondDependencyB(): String = "iSecondDependencyA => ${iSecondDependencyB.getSecond()}"
}