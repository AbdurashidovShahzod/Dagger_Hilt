package uz.unzosoft.daggerhilt.di.module

import javax.inject.Inject

class ISecondDependency @Inject constructor() : SecondDependencyInterface {
    override fun getSecond(): String {
        return "Get SecondDependency"
    }

}