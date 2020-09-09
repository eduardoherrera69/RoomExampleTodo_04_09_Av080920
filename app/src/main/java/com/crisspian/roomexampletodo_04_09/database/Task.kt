package com.crisspian.roomexampletodo_04_09.database

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "table_task")
data class Task(
                @PrimaryKey(autoGenerate = true)
                @NonNull
                var id: Int = 0,
                val task: String,
                val completeTask: Boolean)

