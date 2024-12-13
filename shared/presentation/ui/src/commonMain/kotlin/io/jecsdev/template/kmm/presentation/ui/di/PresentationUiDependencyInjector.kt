package com.jecsdev.template.kmm.presentation.ui.di

import io.jecsdev.lacalle809nyc.core.common.KoinModuleLoader
import com.jecsdev.lacalle809nyc.kmm.core.di.CoreDiDependencyInjector
import org.koin.core.module.Module

object PresentationUiDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            CoreDiDependencyInjector.modules,
            listOf(

            )
        ).flatten()

}