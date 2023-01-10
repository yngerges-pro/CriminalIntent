package com.bignerdranch.android.criminalintent3

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import java.util.Date


data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)