package uz.unzosoft.daggerhilt.di.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class MyModuleP {

    @Singleton
    @Provides
    fun providerSecondDependency1(): SecondDependencyInterface {
        return ISecondDependency()
    }


    @Singleton
    @Provides
    fun providesString(): String {
        return "Provides String"
    }

    @Singleton
    @Provides
    fun providesGson(): Gson = Gson()

    @Singleton
    @Provides
    fun providesSecondDependencyA(): SecondDependencyInterface {
        return ISecondDependencyA()
    }

    @Singleton
    @Provides
    fun providesSecondDependencyB(): SecondDependencyInterface {
        return ISecondDependencyB()
    }

}