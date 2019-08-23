package com.sofka.domain_usecase.users

import com.sofka.domain_model.users.UserInDTO

class UserUseCase(val repository: IUserRespository) {

    fun loginByUsernameAndPassword(username:String,password:String): UserInDTO
    {
        return repository.loginByUsernameAndPassword(username,password)
    }

    fun logOutUser(document:String):Boolean {

        return repository.logOutUser(document)
    }
}