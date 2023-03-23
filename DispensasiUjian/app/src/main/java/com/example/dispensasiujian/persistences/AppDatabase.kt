package com.example.dispensasiujian.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dispensasiujian.model.DaftarDispensasi

@Database(entities = [DaftarDispensasi::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DaftarDispensasiDao(): DaftarDispensasiDao
}