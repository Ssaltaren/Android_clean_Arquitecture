package com.sofka.domain_usecase.cities

import com.sofka.domain_model.cities.CitiyInDTO

class CityUseCase(val repository: ICitiesRepository) {

    fun registerCity(name:String, cityCode: Int): CitiyInDTO {

        return repository.registerCity(name,cityCode)
    }

    fun searchCityByCode(cityCode: Int):CitiyInDTO{

        return repository.searchCityByCode(cityCode)
    }
}