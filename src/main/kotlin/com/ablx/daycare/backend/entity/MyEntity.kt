package com.ablx.daycare.backend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
internal data class MyEntity(
        @field: Id @field: GeneratedValue var id: Long = 0, //Primary Key
        var label: String = ""

)
{
        override fun toString(): String {
                return "Child(id=$id, =label='$label')"
        }
}