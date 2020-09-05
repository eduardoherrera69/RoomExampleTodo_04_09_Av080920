package com.crisspian.roomexampletodo_04_09

import com.crisspian.roomexampletodo_04_09.database.Task
import com.crisspian.roomexampletodo_04_09.database.TaskDao

class TaskRepository(private val mTaskDao: TaskDao) {

    // Este value va a contener todos los datos de la bbdd
    val listAllTask : List<Task> = mTaskDao.getAllTaskFromDb()

    //Esta funcion va a insertar la info.
    fun insertTask(mTask: Task) {
        mTaskDao.insertOneTask(mTask)
    }





}