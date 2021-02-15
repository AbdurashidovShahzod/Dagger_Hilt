package uz.unzosoft.daggerhilt.di.module

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
@Singleton
class SomeDependency @Inject constructor() {
    fun getSome(): String = "Hello Im some dependency"
}