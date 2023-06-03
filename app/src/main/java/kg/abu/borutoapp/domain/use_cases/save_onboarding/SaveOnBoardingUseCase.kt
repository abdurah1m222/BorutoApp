package kg.abu.borutoapp.domain.use_cases.save_onboarding

import kg.abu.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }

}