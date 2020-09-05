package com.crisspian.roomexampletodo_04_09.database

import androidx.room.*
import com.crisspian.roomexampletodo_04_09.database.Task

@Dao
interface TaskDao {

    // insertar un objeto en la tabla
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOneTask(mTask: Task)

    // Insertar multiples objetos Task en la tabla
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMultipleTask(mListTask: List<Task>)

    @Update
    fun updateOneTask(mTask: Task)

    @Delete
    fun deleteOneTask(mTask: Task)

    @Query("SELECT * FROM table_task")
    fun getAllTaskFromDb(): List<Task>

    // Busca un elemento por ID
    @Query("SELECT * FROM table_task WHERE id =:mId")
    fun getOneTaskByID(mId: Int): Task


}