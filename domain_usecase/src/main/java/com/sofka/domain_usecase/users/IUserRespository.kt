package com.sofka.domain_usecase.users

import com.sofka.domain_model.users.UserInDTO

interface IUserRespository {

    fun loginByUsernameAndPassword(username:String,Password:String):UserInDTO

    fun logOutUser(document:String):Boolean

}