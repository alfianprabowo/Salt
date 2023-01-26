package com.main.salt.ui.main.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.main.salt.data.repository.UserRepository

class UserViewModel constructor(
    savedStateHandle: SavedStateHandle,
    repository: UserRepository
): ViewModel() {
}