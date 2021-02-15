package uz.unzosoft.daggerhilt.di.module

import javax.inject.Inject

class ISecondDependencyB @Inject constructor() : SecondDependencyInterface {
    override fun getSecond(): String {
        return "Second dependency B"
    }

}