package com.sofka.infraestructure_data.cities

import com.sofka.domain_model.cities.CitiyInDTO
import com.sofka.domain_usecase.cities.ICitiesRepository

class CitiesRepository(val iCitiesSource: ICitiesSource):ICitiesRepository {
    override fun registerCity(name: String, cityCode: Int): CitiyInDTO {

        return iCitiesSource.registerCity(name,cityCode)
    }

    override fun searchCityByCode(cityCode: Int): CitiyInDTO {

        return iCitiesSource.searchCityByCode(cityCode)
    }
}