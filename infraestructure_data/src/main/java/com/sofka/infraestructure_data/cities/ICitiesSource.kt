package com.sofka.infraestructure_data.cities

import com.sofka.domain_model.cities.CitiyInDTO

interface ICitiesSource {

    fun registerCity(name:String, cityCode: Int): CitiyInDTO
    fun searchCityByCode(cityCode: Int): CitiyInDTO
}