package com.assignment.plantix.di

import com.assignment.plantix.data.LocalData
import com.assignment.plantix.data.NamesListRepositoryImpl
import com.assignment.plantix.data.RemoteData
import com.assignment.plantix.data.database.LocalDataImpl
import com.assignment.plantix.data.network.RemoteDataImpl
import com.assignment.plantix.domain.NamesListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Provides
    @Singleton
    fun provideNamesListRespository(namesListRepository: NamesListRepositoryImpl): NamesListRepository = namesListRepository

    @Provides
    @Singleton
    fun provideLocalData(localData: LocalDataImpl): LocalData = localData

    @Provides
    @Singleton
    fun provideRemoteData(remoteData: RemoteDataImpl): RemoteData = remoteData
}
