package com.plcoding.cleanarchitecturenoteapp.di.module

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

val dbModule = module {
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(app, NoteDatabase::class.java, DATABASE_NAME).build()
    }

    single { provideNoteDatabase(androidApplication()) }

    fun provideNoteDao(db: NoteDatabase): NoteDao {
        return db.noteDao
    }

    single { provideNoteDao(get()) }
}