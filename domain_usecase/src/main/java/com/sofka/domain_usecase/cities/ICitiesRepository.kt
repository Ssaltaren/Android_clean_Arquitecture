package com.sofka.domain_usecase.cities

import com.sofka.domain_model.cities.CitiyInDTO

interface ICitiesRepository {

    fun registerCity(name:String, cityCode: Int): CitiyInDTO
    fun searchCityByCode(cityCode: Int): CitiyInDTO
}