package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

/**
 * Created by Yustar Pramudana on 23/08/23.
 */

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
