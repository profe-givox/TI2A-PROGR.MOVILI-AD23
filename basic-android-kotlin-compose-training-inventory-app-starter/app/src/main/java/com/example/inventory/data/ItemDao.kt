package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Insert
    suspend fun insertarperoo( item: Item   )
    @Update
    suspend fun actualizar( producto : Item )
    @Delete()
    suspend fun eliminar (item: Item)
    @Query("SELECT * from items WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * from items ORDER BY productname ASC")
    fun getAllItems(): Flow<List<Item>>


}