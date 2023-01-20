package com.example.kr2

import android.icu.text.CaseMap

data class poster (val imageId:Int, val title:String)
    class posterList{val list= arrayListOf(poster(R.drawable.`in`,"Спокойным"),
        poster(R.drawable.man,"Расслабленным"),
        poster(R.drawable.wind,"Задумчевым"),
        poster(R.drawable.`in`,"Взвол\nнованным"),
        )
}
data class poster_2 (val imageId:Int, val title:String, val title_2:String)
    class posterList_2{val list= arrayListOf(poster_2(R.drawable.v_rec_1,"Заголовок блока","Краткое описание \nблока с двумя строчками"),
    poster_2(R.drawable.v_rec_2,"Заголовок блока","Краткое описание \nблока с двумя строчками"),
    poster_2(R.drawable.v_rec_3,"Заголовок блока","Краткое описание \nблока с двумя строчками"),
    poster_2(R.drawable.v_rec_1,"Заголовок блока","Краткое описание \nблока с двумя строчками"),
)
}