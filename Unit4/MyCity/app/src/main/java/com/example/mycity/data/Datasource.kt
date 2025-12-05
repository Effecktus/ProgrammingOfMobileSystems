package com.example.mycity.data

import com.example.mycity.R

object Datasource {
    val attractions: List<Attraction> = listOf(
        Attraction(
            id = 1,
            title = "Памятник Чернушки",
            location = "Заинск",
            description = "Капсула с собакой-космонавтом приземлилась под Заинском в 1963 году. Сегодня памятник напоминает о космической истории города.",
            imageRes = R.drawable.ic_launcher_foreground
        ),
        Attraction(
            id = 2,
            title = "Обелиск Вилочного мятежа",
            location = "Заинский район",
            description = "Памятный знак участникам крестьянского восстания 1920 года. Место для тихих прогулок и памяти.",
            imageRes = R.drawable.ic_launcher_foreground
        ),
        Attraction(
            id = 3,
            title = "Школьная гора",
            location = "Центр города",
            description = "Историческая точка с видами на городскую черту. Здесь располагалась крепость и училище, популярное место для прогулок.",
            imageRes = R.drawable.ic_launcher_foreground
        )
    )
}

