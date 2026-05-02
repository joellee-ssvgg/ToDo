package com.example.cheery.data
import androidx.room.*

@Entity(
    tableName = "user_table",
    indices = [Index(value=["user_id"])]
)
data class User (
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val username: String,
    val password: String
)