package org.wit.placemark.models

import android.net.Uri
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class PlacemarkModel(var id: Long = 0,
                          var title: String = "",
                          var description: String = "",
                          var image : Uri = Uri.EMPTY) : Parcelable


