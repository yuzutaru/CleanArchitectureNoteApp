package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

sealed class OrderType {
    object  Ascending: OrderType()
    object  Descending: OrderType()
}
