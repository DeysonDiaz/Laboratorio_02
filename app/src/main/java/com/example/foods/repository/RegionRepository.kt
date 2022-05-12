package com.example.foods.repository

import com.example.foods.model.Region

class RegionRepository {
    fun getAllData(): List<Region>{
        return listOf(
            Region(
                id = 1,
                name = "Amazonas",
            ),
            Region(
                id = 2,
                name = "Lambayeque",
            ),
            Region(
                id = 3,
                name = "Ancash",
            ),
            Region(
                id = 4,
                name = "Lima",
            ),
            Region(
                id = 5,
                name = "Arequipa",
            ),
            Region(
                id = 6,
                name = "Loreto",
            ),
            Region(
                id = 7,
                name = "Ayacucho",
            ),
            Region(
                id = 8,
                name = "Madre de Dios",
            ),
            Region(
                id = 9,
                name = "Apurimac",
            ),
            Region(
                id = 10,
                name = "Moquegua",
            ),
            Region(
                id = 11,
                name = "Cajamarca",
            ),
            Region(
                id = 12,
                name = "Pasco",
            ),
            Region(
                id = 13,
                name = "Cusco",
            ),
            Region(
                id = 14,
                name = "Piura",
            ),
            Region(
                id = 15,
                name = "Huancavelica",
            ),
            Region(
                id = 16,
                name = "Puno",
            ),
            Region(
                id = 17,
                name = "Huánuco",
            ),
            Region(
                id = 18,
                name = "San Martin",
            ),
            Region(
                id = 19,
                name = "Ica",
            ),
            Region(
                id = 20,
                name = "Tacna",
            ),
            Region(
                id = 21,
                name = "Junín",
            ),
            Region(
                id = 22,
                name = "Tumbes",
            ),
            Region(
                id = 23,
                name = "La Libertad",
            ),
            Region(
                id = 24,
                name = "Ucayali",
            ),
        )
    }
}