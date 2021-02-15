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
    fun providerSecondDependency(stringDependency: String): SecondDependencyInterface {
        return ISecondDependency(stringDependency)
    }

    @Singleton
    @Provides
    fun providesString(): String {
        return "Provides String"
    }

    @Singleton
    @Provides
    fun providesGson(): Gson = Gson()
}