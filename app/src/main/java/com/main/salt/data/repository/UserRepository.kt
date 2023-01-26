package com.main.salt.data.repository

import com.main.salt.data.model.User
import com.main.salt.utils.Response
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun login(): Flow<Response<User>>
    fun getUser(id: Int): Flow<Response<User>>
}