package com.jecsdev.template.kmm.data.repository.di

import io.jecsdev.lacalle809nyc.core.common.KoinModuleLoader
import io.jecsdev.template.kmm.data.repository.features.preferences.PreferencesRepositoryImpl
import io.jecsdev.template.kmm.domain.repository.features.preferences.PreferencesRepository
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

object DataRepositoryDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            module {
                factoryOf(::PreferencesRepositoryImpl) bind PreferencesRepository::class
            }
        )
}
