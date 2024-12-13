package io.afalabarce.lacalle809nyc.core.common

import io.jecsdev.lacalle809nyc.`la-calle-809-nyc`.core.platform.entities.PlatformData

interface Platform {
    val platformData: PlatformData
}

expect fun getPlatform(): Platform