package edu.itsco.notas.ui.screens

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import edu.itsco.notas.data.persistence.Nota
import edu.itsco.notas.data.persistence.NotaDatabase
import edu.itsco.notas.data.repositories.NotasRepository

class NotasViewModel(application: Application): ViewModel() {

    val allNotas: LiveData<List<Nota>>

    private val notasRepository: NotasRepository

    init{
        val notasDatabase: NotaDatabase =
            NotaDatabase.getInstance(application.applicationContext)
        notasRepository = NotasRepository(notasDatabase.getDaoNota())
        allNotas = notasRepository.allNotas
    }

    fun nuevaNota(nota: Nota){
        notasRepository.nuevaNota(nota = nota)
    }
}