package com.example.dispensasiujian.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.dispensasiujian.model.DaftarDispensasi

@Dao
interface DaftarDispensasiDao {
    @Query("SELECT * FROM DaftarDispensasi")
    fun loadAll(): LiveData<List<DaftarDispensasi>>

    @Query("SELECT * FROM DaftarDispensasi WHERE id = :id")
    fun find(id: String): DaftarDispensasi?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DaftarDispensasi)
    @Delete
    fun delete(item: DaftarDispensasi)
}