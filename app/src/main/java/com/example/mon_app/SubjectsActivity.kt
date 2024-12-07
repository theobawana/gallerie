package com.example.mon_app

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

data class SubjectItem(val image: Int, val name: String,val niveau: String)

class SubjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects)

        val listView: ListView = findViewById(R.id.subjects_list_view)

        // Exemple de données pour les matières
        val subjects = listOf(
            SubjectItem(R.drawable.ic_mobile, "Programmation Mobile", "Niveau : ING 3"),
            SubjectItem(R.drawable.ic_prog, "Programmation Web", "Niveau : ING 2 et ING3 "),
            SubjectItem(R.drawable.ic_fonctionnelle, "Programmation Fonctionnelle", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_impe, "Programmation Imperative", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_oritn, "Programmation Orientée Objet", "Niveau : ING 2"),
            SubjectItem(R.drawable.ic_bd, "Base de données", "Niveau : ING 1 et ING 2"),
            SubjectItem(R.drawable.ic_circuit, "Circuit logique", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_stainf, "Statistique Inférentielle", "Niveau : ING 1 "),
            SubjectItem(R.drawable.ic_proba, "Probabilité", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_traitenu, "Traitement Numérique du Signal", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_logicf, "Logique Formelle", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_add, "Analyse de données", "Niveau : ING 3"),
            SubjectItem(R.drawable.ic_ana, "Analyse de Fourier", "Niveau : ING 1 "),
            SubjectItem(R.drawable.ic_wind, "Initiation à Windows", "Niveau : ING 1"),
            SubjectItem(R.drawable.ic_geni, "Génie Logiciel", "Niveau : ING 2"),
            SubjectItem(R.drawable.ic_uml, "Unified Modelling Language", "Niveau : ING 2"),
            SubjectItem(R.drawable.ic_prolog, "Répresentation des Connaissances", "Niveau : ING 2")
        )


        val adapter = SubjectsAdapter(this, subjects)
        listView.adapter = adapter
    }
}
