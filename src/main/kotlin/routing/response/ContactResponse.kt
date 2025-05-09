package com.example.crm.routing.response

import com.example.crm.utils.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class ContactResponse(
    val id: Int,
    @Serializable(with = UUIDSerializer::class)
    val userId: UUID,
    val name: String,
    val company: String?,
    val phoneNumber: String?,
    val contactEmail: String?
)