package com.example.recycle.datasource

import com.example.recycle.R
import com.example.recycle.modul.datamodel

class data {
    fun loadingData():List<datamodel>{
        return listOf<datamodel>(
            datamodel(R.string.jan),
            datamodel(R.string.feb),
            datamodel(R.string.mar),
            datamodel(R.string.apr),
            datamodel(R.string.may),
            datamodel(R.string.jun),
            datamodel(R.string.jul),
            datamodel(R.string.aug),
            datamodel(R.string.sep),
            datamodel(R.string.oct),
            datamodel(R.string.nov),
            datamodel(R.string.dec),
        )
    }
}