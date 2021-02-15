package uz.unzosoft.daggerhilt.di.module

import javax.inject.Inject

class ISecondDependencyA @Inject constructor() : SecondDependencyInterface {
    override fun getSecond(): String {
        return "Second dependency A"
    }

}