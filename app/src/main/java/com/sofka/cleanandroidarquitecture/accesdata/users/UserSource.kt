package com.sofka.cleanandroidarquitecture.accesdata.users

import com.sofka.domain_model.users.UserInDTO
import com.sofka.infraestructure_data.users.IUserSouce

class UserSource():IUserSouce {
    override fun loginByUsernameAndPassword(username: String, Password: String): UserInDTO {

        return UserInDTO("santaigo","1234")
    }

    override fun logOutUser(document: String): Boolean {

        return true
    }
}