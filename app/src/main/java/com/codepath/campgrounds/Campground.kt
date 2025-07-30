package com.codepath.campgrounds

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// TODO: Create a data class for the Data Response


// TODO: Implement remaining keys of the Campground data class
@Keep
@Serializable
data class Campground(
    @SerialName("name")
    val name: String?,
) : java.io.Serializable


// TODO: Create a data class for the Image Response
