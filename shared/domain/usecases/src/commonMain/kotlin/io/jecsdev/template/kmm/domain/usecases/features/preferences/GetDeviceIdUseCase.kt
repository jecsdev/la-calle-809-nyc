package com.jecsdev.template.kmm.domain.usecases.features.preferences

import io.jecsdev.template.kmm.domain.repository.features.preferences.PreferencesRepository
import kotlinx.coroutines.flow.Flow

class GetDeviceIdUseCase(private val repository: PreferencesRepository) {
    operator fun invoke(): Flow<Long> = this.repository.getDeviceId()
}