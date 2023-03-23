package com.example.dispensasiujian.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DaftarDispensasi(
    @PrimaryKey val id: String,
    val npm: String,
    val nama: String,
    val matakuliah: String,
    val tanggalujian: String,
)