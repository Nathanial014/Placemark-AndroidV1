package org.setu.placemark.models

/**
 * Data class representing a single Placemark item.
 * Kotlin automatically generates toString(), equals(), hashCode(), and copy().
 */
data class PlacemarkModel(
    var id: Long = 0L,
    val title: String = "",
    val description: String = "",
    val x: Double = 0.0,
    val y: Double = 0.0
)
