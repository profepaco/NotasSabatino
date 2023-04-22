package edu.itsco.notas.data.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notas")
data class Nota(
    @PrimaryKey(autoGenerate = true) val id:Int,
    val titulo: String,
    val detalle: String
)