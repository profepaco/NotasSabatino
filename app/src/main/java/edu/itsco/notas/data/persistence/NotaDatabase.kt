package edu.itsco.notas.data.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Nota::class],version = 1)
abstract class NotaDatabase: RoomDatabase() {
    abstract fun getDaoNota(): DaoNota

    companion object{

        var INSTANCE: NotaDatabase? = null

        fun getInstance(context: Context): NotaDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context = context,
                        klass = NotaDatabase::class.java,
                        name = "db_notas"
                    ).build()
                }
                INSTANCE = instance
                return instance
            }
        }
    }
}