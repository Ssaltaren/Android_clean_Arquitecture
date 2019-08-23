package com.sofka.cleanandroidarquitecture.userinterfaces.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sofka.cleanandroidarquitecture.R
import com.sofka.cleanandroidarquitecture.dependencieinjection.cities.CitiesUseCaseFactory
import com.sofka.cleanandroidarquitecture.dependencieinjection.users.UserUseCaseFactory

class MainActivity : AppCompatActivity() {

    val userUsecase = UserUseCaseFactory().getUserUseCase()
    val citiesUsecase = CitiesUseCaseFactory().getCitiesUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(userUsecase.loginByUsernameAndPassword("",""))
        println(citiesUsecase.searchCityByCode(0).name)
    }
}
