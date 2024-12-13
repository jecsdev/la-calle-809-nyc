package com.jecsdev.lacalle809nyc.core.common

import org.koin.core.module.Module

interface KoinModuleLoader {
    val modules: List<Module>
}