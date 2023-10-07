package com.plcoding.cleanarchitecturenoteapp.di.module

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.AddEditNoteViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.NotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

val viewModelModule = module {
    fun provideNotesViewModel(noteUseCases: NoteUseCases): NotesViewModel {
        return NotesViewModel(noteUseCases)
    }

    viewModel { provideNotesViewModel(get()) }

    fun provideAddEditNoteViewModel(savedStateHandle: SavedStateHandle, noteUseCases: NoteUseCases):
            AddEditNoteViewModel {
        return AddEditNoteViewModel(savedStateHandle, noteUseCases)
    }

    viewModel { provideAddEditNoteViewModel(SavedStateHandle(), get()) }
}