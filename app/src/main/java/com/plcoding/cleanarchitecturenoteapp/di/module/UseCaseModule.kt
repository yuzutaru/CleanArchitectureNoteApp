package com.plcoding.cleanarchitecturenoteapp.di.module

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.AddNote
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.DeleteNote
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.GetNotes
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import org.koin.dsl.module

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

val useCaseModule = module {
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository = repository),
            deleteNote = DeleteNote(repository = repository),
            addNote = AddNote(repository = repository)
        )
    }

    single { provideNoteUseCases(get()) }
}