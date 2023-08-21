package com.plcoding.cleanarchitecturenoteapp.di

import com.plcoding.cleanarchitecturenoteapp.di.module.dbModule
import com.plcoding.cleanarchitecturenoteapp.di.module.repositoryModule
import com.plcoding.cleanarchitecturenoteapp.di.module.useCaseModule

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

val appModules = listOf(dbModule, repositoryModule, useCaseModule)