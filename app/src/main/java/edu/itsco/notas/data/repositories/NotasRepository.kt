package edu.itsco.notas.data.repositories

import androidx.lifecycle.LiveData
import edu.itsco.notas.data.persistence.DaoNota
import edu.itsco.notas.data.persistence.Nota
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotasRepository(private val notaDao: DaoNota) {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    val allNotas: LiveData<List<Nota>> = notaDao.getAllNotas()

    fun nuevaNota(nota: Nota){
        coroutineScope.launch(Dispatchers.IO){
            notaDao.insertNota(nota = nota)
        }
    }
}