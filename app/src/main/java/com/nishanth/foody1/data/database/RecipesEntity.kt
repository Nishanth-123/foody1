package com.nishanth.foody1.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomMasterTable.TABLE_NAME
import com.nishanth.foody1.models.FoodRecipe

@Entity(tableName = TABLE_NAME)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}