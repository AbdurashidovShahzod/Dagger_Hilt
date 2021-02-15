package uz.unzosoft.daggerhilt.di.module

import android.content.Context
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
abstract class MyModule {
    @Binds
    @Singleton
    abstract fun bindSecondDependency(
        iSecondDependency: ISecondDependency
    ): SecondDependencyInterface

    @Binds
    @Singleton
    abstract fun bindGson(
        gson: Gson
    ): Gson


    @Binds
    @Singleton
    abstract fun bindContext(
        context: Context
    ): Context
}