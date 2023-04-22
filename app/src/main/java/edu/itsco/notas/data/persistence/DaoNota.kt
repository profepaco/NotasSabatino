package edu.itsco.notas.data.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoNota {

    @Query("SELECT * FROM notas")
    fun getAllNotas(): List<Nota>

    @Insert
    fun insertNota(nota: Nota)

}