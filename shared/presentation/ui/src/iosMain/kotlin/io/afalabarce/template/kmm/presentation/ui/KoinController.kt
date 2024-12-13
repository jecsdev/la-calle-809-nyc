package com.jecsdev.template.kmm.presentation.ui

import io.jecsdev.template.kmm.presentation.ui.di.PresentationUiDependencyInjector
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(
            PresentationUiDependencyInjector.modules
        )
    }
}
