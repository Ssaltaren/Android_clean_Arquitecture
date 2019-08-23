package com.sofka.cleanandroidarquitecture.dependencieinjection.users

import com.sofka.cleanandroidarquitecture.accesdata.users.UserSource
import com.sofka.domain_usecase.users.UserUseCase
import com.sofka.infraestructure_data.users.UserRepository


class UserUseCaseFactory {

    fun getUserUseCase():UserUseCase{

        return UserUseCase(UserRepository(UserSource()))
    }
}