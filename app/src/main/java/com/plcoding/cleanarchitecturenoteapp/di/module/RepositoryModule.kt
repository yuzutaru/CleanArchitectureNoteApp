package com.plcoding.cleanarchitecturenoteapp.di.module

import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import org.koin.dsl.module

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

val repositoryModule = module {
    fun provideNoteRepository(dao: NoteDao): NoteRepository {
        return NoteRepositoryImpl(dao)
    }

    single { provideNoteRepository(get()) }
}