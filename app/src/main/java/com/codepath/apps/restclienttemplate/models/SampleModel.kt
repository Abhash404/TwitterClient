package com.codepath.apps.restclienttemplate.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.json.JSONException
import org.json.JSONObject

@Entity
class SampleModel(jsonObject: JSONObject? = null) {

    @PrimaryKey(autoGenerate = true)
    var id: Long? = null

    @ColumnInfo
    var name: String? = null

    init {

        try {

            name = jsonObject?.getString("title")

        }

        catch (e: JSONException) {
            e.printStackTrace()

        }
    }
}