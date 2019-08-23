package com.sofka.cleanandroidarquitecture.dependencieinjection.cities

import com.sofka.cleanandroidarquitecture.accesdata.cities.CitiesSource
import com.sofka.domain_usecase.cities.CityUseCase
import com.sofka.infraestructure_data.cities.CitiesRepository

class CitiesUseCaseFactory {

    fun getCitiesUseCase():CityUseCase{

        return CityUseCase(CitiesRepository(CitiesSource()))
    }
}