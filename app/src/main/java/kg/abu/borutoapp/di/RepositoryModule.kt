package kg.abu.borutoapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kg.abu.borutoapp.data.repository.DataStoreOperationsImpl
import kg.abu.borutoapp.data.repository.Repository
import kg.abu.borutoapp.domain.repository.DataStoreOperations
import kg.abu.borutoapp.domain.use_cases.UseCases
import kg.abu.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import kg.abu.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository)
        )
    }

}