package org.wit.placemark.models

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class PlacemarkModel(var id: Long = 0,
                          var title: String = "",
                          var description: String = "") : Parcelable


