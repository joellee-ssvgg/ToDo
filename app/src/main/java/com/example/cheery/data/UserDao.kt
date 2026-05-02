package com.example.cheery.data
import androidx.room.*

@Dao
interface UserDao{
    @Insert
    suspend fun insertUser(user: User): Long
    @Update
    suspend fun updateUser(user: User)
    @Delete
    suspend fun deleteUser(user: User)
    @Query("SELECT*FROM user_table")
    suspend fun getAllUsers():List<User>
    @Query("SELECT*FROM user_table WHERE id= :id")
    suspend fun byId(id:Long): User?
    @Query("SELECT*FROM user_table WHERE username= :username")
    suspend fun byName(username: String): User?
    @Query("SELECT*FROM user_table WHERE username= :username")
    suspend fun check(username: String):Int
}