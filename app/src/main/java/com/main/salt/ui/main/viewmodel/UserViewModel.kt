package com.main.salt.ui.main.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.main.salt.data.model.User
import com.main.salt.data.repository.UserRepository
import com.main.salt.utils.Response
import kotlinx.coroutines.launch

class UserViewModel constructor(
    savedStateHandle: SavedStateHandle,
    userRepository: UserRepository
): ViewModel() {
    private val _userState = mutableStateOf<Response<User>>(Response.Success(null))
        val userState: State<Response<User>> = _userState

    fun getUser(id: Int){
        viewModelScope.launch {
//            userRepository.getUser(id).collect {
//                response ->
//                _userState.value = response
//            }
        }
    }
}