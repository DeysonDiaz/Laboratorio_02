package com.example.foods.repository

import com.example.foods.model.Region

class RegionRepository {
    fun getAllData(): List<Region>{
        return listOf(
            Region(
                id = 1,
                name = "Amazonas",
                foods = listOf("Tacacho con cecina","Juane","Ceviche Dorado")
            ),
            Region(
                id = 2,
                name = "Lambayeque",
                foods = listOf("Aji de Gallina","Poroto","Lenteja")
            ),
            Region(
                id = 3,
                name = "Ancash",
                foods = listOf("Calabaza","Caldo","La papita del choco")
            ),
            Region(
                id = 4,
                name = "Lima",
                foods = listOf("Pastel de papa","Pollo","Locro")
            ),
            Region(
                id = 5,
                name = "Arequipa",
                foods = listOf("Adobo ","Rocoto Relleno","Soltero")
            ),
            Region(
                id = 6,
                name = "Loreto",
                foods = listOf("Cevichano","Arroz con pato","Matasquita")
            ),
            Region(
                id = 7,
                name = "Ayacucho",
                foods = listOf("Rocoto Relleno","Arroz con Pato","")
            ),
            Region(
                id = 8,
                name = "Madre de Dios",
                foods = listOf("Ceviche","Arroz","Papa")
            ),
            Region(
                id = 9,
                name = "Apurimac",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 10,
                name = "Moquegua",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 11,
                name = "Cajamarca",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 12,
                name = "Pasco",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 13,
                name = "Cusco",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 14,
                name = "Piura",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 15,
                name = "Huancavelica",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 16,
                name = "Puno",
                foods = listOf("Trucha frita","Cancacho","Chairo")
            ),
            Region(
                id = 17,
                name = "Huánuco",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 18,
                name = "San Martin",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 19,
                name = "Ica",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 20,
                name = "Tacna",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 21,
                name = "Junín",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 22,
                name = "Tumbes",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
            Region(
                id = 23,
                name = "La Libertad",
                foods = listOf("Seco de cabrito","Arroz con pato","Ceviche de Conchas")
            ),
            Region(
                id = 24,
                name = "Ucayali",
                foods = listOf("Rocoto Relleno","Arroz","Papa")
            ),
        )
    }
}