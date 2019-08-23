package com.sofka.cleanandroidarquitecture.accesdata.cities

import com.sofka.domain_model.cities.CitiyInDTO
import com.sofka.infraestructure_data.cities.ICitiesSource

class CitiesSource():ICitiesSource {
    override fun registerCity(name: String, cityCode: Int): CitiyInDTO {

        return CitiyInDTO("medellin",0)
    }

    override fun searchCityByCode(cityCode: Int): CitiyInDTO {

        return CitiyInDTO("barranquilla",1)
    }
}