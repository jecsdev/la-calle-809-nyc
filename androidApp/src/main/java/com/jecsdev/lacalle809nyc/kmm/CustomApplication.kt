package com.jecsdev.lacalle809nyc.kmm

import android.app.Application
import io.jecsdev.template.kmm.presentation.ui.di.PresentationUiDependencyInjector
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class CustomApplication : Application() {
    override fun onCreate() {
        startKoin {
            androidContext(this@CustomApplication)
            modules(PresentationUiDependencyInjector.modules)
        }

        super.onCreate()
    }
}