package com.example.mon_app

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CaptureActivity : AppCompatActivity() {

    private lateinit var capturedImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        capturedImageView = findViewById(R.id.capturedImageView)
        val buttonTakePicture: Button = findViewById(R.id.buttonTakePicture)
        val buttonCancel: Button = findViewById(R.id.buttonCancel)

        // Action pour capturer une photo
        buttonTakePicture.setOnClickListener {
            openCamera()
        }

        // Action pour annuler
        buttonCancel.setOnClickListener {
            finish() // Ferme l'activité
        }
    }

    private fun openCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (intent.resolveActivity(packageManager) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            capturedImageView.setImageBitmap(imageBitmap)
        }
    }

    companion object {
        private const val REQUEST_IMAGE_CAPTURE = 1
    }
}
