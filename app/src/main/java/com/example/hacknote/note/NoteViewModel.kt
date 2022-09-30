package com.example.hacknote.note

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    init {
        Log.d("maho", "NoteViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("maho", "NoteViewModel onCleared")
    }
}