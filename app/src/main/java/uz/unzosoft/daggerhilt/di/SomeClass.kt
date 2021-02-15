package uz.unzosoft.daggerhilt.di

import uz.unzosoft.daggerhilt.di.module.ISecondDependency
import uz.unzosoft.daggerhilt.di.module.SecondDependencyInterface
import uz.unzosoft.daggerhilt.di.module.SomeDependency
import uz.unzosoft.daggerhilt.di.module.SomeOtherClass
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeClass @Inject constructor(
    private val someOtherClass: SomeOtherClass,
    private val someDependency: SomeDependency,
    private val iSecondDependency: SecondDependencyInterface
) {
    fun doAThing() = "Look I did a thing!!!"

    fun doSomeOther(): String {
        return someOtherClass.doAThing()
    }

    fun someDependency(): String {
        return "Some class ${someDependency.getSome()}"
    }

}