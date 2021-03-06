package com.example.tasktimerapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(task:Task)

    @Query("select * from task")
    fun getTasks(): LiveData<List<Task>>

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("UPDATE task SET active = :inactive WHERE active = :active")
    fun deactivateAllTasks(inactive: Boolean = false, active: Boolean = true)

    @Query("SELECT * FROM task WHERE active = :active LIMIT 1")
    fun getTaskByActive(active: Boolean = true): Task

}