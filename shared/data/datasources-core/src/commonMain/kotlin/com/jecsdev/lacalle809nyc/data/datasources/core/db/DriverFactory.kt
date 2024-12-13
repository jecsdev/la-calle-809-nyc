package com.jecsdev.lacalle809nyc.data.datasources.core.db

import app.cash.sqldelight.db.SqlDriver
import com.jecsdev.template.kmm.data.datasources.core.db.KmmDatabase

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): KmmDatabase {
    val driver = driverFactory.createDriver()
    val database = KmmDatabase(driver)

    // Do more work with the database (see below).
    return database
}
