package com.example.whatididlearn

import android.app.Application
import com.example.whatididlearn.di.LearnedItemModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

    class WhatDidIlearnedApplication : Application() {

        override fun onCreate() {
            super.onCreate()
            startKoin {
                androidLogger()
                androidContext(this@WhatDidIlearnedApplication)
                modules(LearnedItemModel.module)
            }
        }

    }