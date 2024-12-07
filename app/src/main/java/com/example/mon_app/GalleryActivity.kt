package com.example.mon_app

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mon_app.R.*

class GalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_gallery)
        val listView: ListView = findViewById(id.listView)

        // Exemple de données
        val items = listOf(
            ListItem(drawable.image_3, "THEODORE Bawana",  "Nationalité: Togolaise", "Classe: ING 3"),
            ListItem(drawable.image_4, "MAURICE Yann",  "Nationalité: Togolaise", "Classe: ING 3"),
            ListItem(drawable.image_1, "DJEKOURBOUA Janvier", "Nationalité: Tchadienne", "Classe: ING 3"),
            ListItem(drawable.image_2, "PITIMBAYE Eveline",  "Nationalité: Tchadienne", "Classe: ING 3"),
            ListItem(drawable.image_5, "REMADJI DJIMOYAL Eric",  "Nationalité: Tchadienne", "Classe: ING 3"),
            ListItem(drawable.image_6, "MOUBAROU TED Orli",  "Nationalité: Gabonaise", "Classe: ING 3"),
            ListItem(drawable.image_7, "BRUNE Marina", "Nationalité: Gabonaise", "Classe: ING 3"),
            ListItem(drawable.image_8, "ZENG KOUEREY Doguy", "Nationalité: Gabonaise", "Classe: ING 3",),
            ListItem(drawable.image_9, "LEMBIOGO Glen", "Nationalité: Gabonaise", "Classe: ING 3",),
            ListItem(drawable.image_10, "MEKILA KAGWEI Eloi", "Nationalité: Tchadienne", "Classe: ING 3",),
            ListItem(drawable.image_11, "KAREN Fifi", "Nationalité: Gabonaise", "Classe: ING 3",),
            ListItem(drawable.image_12, "SALY ", "Nationalité: Gabonaise", "Classe: ING 3",),
            ListItem(drawable.image_13, "AGBOSSA Yao", "Nationalité: Togolaise", "Classe: ING 3",),
            ListItem(drawable.image_14, "CABREL", "Nationalité: Gabonaise", "Classe: ING 3",),
            ListItem(drawable.image_15, "FRED", "Nationalité: Gabonaise", "Classe: ING 3",)
        )


        val adapter = ListViewAdapter(this, items)
        listView.adapter = adapter
    }
}
