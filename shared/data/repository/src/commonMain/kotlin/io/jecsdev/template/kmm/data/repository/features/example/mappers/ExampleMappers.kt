package com.jecsdev.template.kmm.data.repository.features.example.mappers

import io.jecsdev.template.kmm.models.features.example.local.CacheExampleEntity
import io.jecsdev.template.kmm.models.features.example.remote.RemoteExampleEntity
import io.jecsdev.template.kmm.domain.models.ExampleEntity

fun ExampleEntity.toCache(): CacheExampleEntity = CacheExampleEntity(
    id = id,
    title = title,
    description = description
)

fun ExampleEntity.toRemote(): RemoteExampleEntity = RemoteExampleEntity(
    remoteId = id,
    remoteTitle = title,
    remoteDescription = description
)

fun RemoteExampleEntity.toCache(): CacheExampleEntity = CacheExampleEntity(
    id = remoteId,
    title = remoteTitle,
    description = remoteDescription
)

fun CacheExampleEntity.toDomain(): ExampleEntity = ExampleEntity(
    id = id,
    title = title,
    description = description
)
