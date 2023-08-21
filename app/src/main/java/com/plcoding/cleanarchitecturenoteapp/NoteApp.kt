package com.plcoding.cleanarchitecturenoteapp

import android.app.Application
import com.plcoding.cleanarchitecturenoteapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

class NoteApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@NoteApp)
            modules(appModules)
        }
    }
}