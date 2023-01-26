package com.main.salt.network.repository

import com.main.salt.data.model.User
import com.main.salt.data.repository.UserRepository
import com.main.salt.network.service.UserService
import com.main.salt.utils.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class UserRepositoryImpl(
    private val userService: UserService,
    private val email: String,
    private val password: String,
):UserRepository {
    override fun login(): Flow<Response<User>> = flow{
        try {
            emit(Response.Loading)
            val responseApi = userService.login(
                email = email,
                password = password
            )
            emit(Response.Success(responseApi))
        } catch (e: Exception) {
            emit(Response.Failure(e))
        }
    }.flowOn(Dispatchers.IO)
    override fun getUser(id:Int): Flow<Response<User>> = flow{
        try {
            emit(Response.Loading)
            val responseApi = userService.login(
                email = email,
                password = password
            )
            emit(Response.Success(responseApi))
        } catch (e: Exception) {
            emit(Response.Failure(e))
        }
    }.flowOn(Dispatchers.IO)
}