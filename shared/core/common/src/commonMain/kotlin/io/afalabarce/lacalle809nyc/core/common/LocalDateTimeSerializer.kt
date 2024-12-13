package com.jecsdev.lacalle809nyc.core.common

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override val descriptor = PrimitiveSerialDescriptor("LocalDateTime", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): LocalDateTime {
        for (format in supportedDateFormat) {
            try {
                return decoder.decodeString().toLocalDateTime(format)!!
            } catch (_: Exception) {

            }
        }

        throw RuntimeException("Error parsing date")
    }

    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        encoder.encodeString(value = value.format())
    }
}
