package com.sofka.infraestructure_data.users

import com.sofka.domain_model.users.UserInDTO

interface IUserSouce {

    fun loginByUsernameAndPassword(username:String,Password:String): UserInDTO
    fun logOutUser(document:String):Boolean
}