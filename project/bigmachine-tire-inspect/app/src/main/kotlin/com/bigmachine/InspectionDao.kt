package com.bigmachine

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface InspectionDao {
    @Query("SELECT * FROM inspections ORDER BY dateTime DESC")
    suspend fun getAllInspections(): List<Inspection>

    @Insert
    suspend fun insert(inspection: Inspection)
}
