package com.sofka.infraestructure_data.users

import com.sofka.domain_model.users.UserInDTO
import com.sofka.domain_usecase.users.IUserRespository

class UserRepository (val iUserSouce: IUserSouce):IUserRespository{
    override fun loginByUsernameAndPassword(username: String, password: String): UserInDTO {

        return iUserSouce.loginByUsernameAndPassword(username,password)
    }

    override fun logOutUser(document: String): Boolean {

        return iUserSouce.logOutUser(document)
    }
}