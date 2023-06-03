package kg.abu.borutoapp.domain.use_cases

import kg.abu.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import kg.abu.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(

    val saveOnBoardingUseCase: SaveOnBoardingUseCase,

    val readOnBoardingUseCase: ReadOnBoardingUseCase
)
