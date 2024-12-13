package com.jecsdev.lacalle809nyc.kmm.core.di

import com.jecsdev.lacalle809nyc.core.common.KoinModuleLoader
import com.jecsdev.template.kmm.data.datasources.core.di.DataSourceCoreDependencyInjector
import com.jecsdev.template.kmm.data.repository.di.DataRepositoryDependencyInjector
import com.jecsdev.template.kmm.domain.usecases.di.DomainUseCasesDependencyInjector
import io.jecsdev.template.kmm.presentation.viewmodels.di.PresentationViewModelsDependencyInjector
import org.koin.core.module.Module

object CoreDiDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            DataSourceCoreDependencyInjector.modules,
            DataRepositoryDependencyInjector.modules,
            DomainUseCasesDependencyInjector.modules,
            PresentationViewModelsDependencyInjector.modules,
        ).flatten()
}
