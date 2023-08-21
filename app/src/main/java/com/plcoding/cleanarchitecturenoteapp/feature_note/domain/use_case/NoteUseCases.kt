package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)