package uz.unzosoft.daggerhilt.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
abstract class MyModule {
    @Binds
    @Singleton
    abstract fun bindSecondDependency(
        iSecondDependency: ISecondDependency
    ): SecondDependencyInterface
}