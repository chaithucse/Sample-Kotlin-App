package com.example.demoandroid.di

import com.example.demoandroid.data.DataRepository
import com.example.demoandroid.data.io.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun providesRepository(apiService: ApiService): DataRepository {
        return DataRepository(apiService)
    }
}