package io.jecsdev.lacalle809nyc.`la-calle-809-nyc`.core.platform.entities

import io.jecsdev.lacalle809nyc.`la-calle-809-nyc`.core.platform.enums.PlatformType

data class PlatformData(
    val platformType: PlatformType,
    val osVersion: String
) {
    override fun toString(): String = "${platformType.name} v. $osVersion"
}