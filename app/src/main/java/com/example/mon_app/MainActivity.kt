package com.example.mon_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Gérer le clic sur le bouton Gallery
        findViewById<Button>(R.id.buttonGallery).setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }

        // Gérer le clic sur le bouton Sujet
        findViewById<Button>(R.id.buttonSujet).setOnClickListener {
            val intent = Intent(this, SubjectsActivity::class.java)
            startActivity(intent)
        }

        // Gérer le clic sur le bouton Mail
        findViewById<Button>(R.id.buttonMail).setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822" // Type MIME pour les applications d'email
                putExtra(Intent.EXTRA_EMAIL, arrayOf("theodore8bawana@gmail.com")) // Facultatif
                putExtra(Intent.EXTRA_SUBJECT, "Sujet de l'email") // Facultatif
                putExtra(Intent.EXTRA_TEXT, "Contenu de l'email") // Facultatif
            }
            // Vérifiez si une application de messagerie est disponible
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(intent, "Choisissez une application"))
            } else {
                // Message ou action alternative si aucune application n'est disponible
                println("Aucune application de messagerie installée.")
            }
        }


        findViewById<Button>(R.id.buttonCapture).setOnClickListener {
            // Ajoutez ici l'intention ou l'action pour le bouton Capture
            val intent = Intent(this, CaptureActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
