package com.viniciusmo.hello

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import com.hello.sdk.HelloSdk

class MainActivity : ComponentActivity() {

    private val capturedImage = mutableStateOf<Bitmap?>(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val helloSdk = HelloSdk(
            activity = this,
            onSuccess = { bitmap ->
                capturedImage.value = bitmap
            },
            onFailed = { exception ->
                Log.e("MainActivity", "Selfie capture failed: ${exception.message}")
            }
        )

        setContent {
            // Observe the captured image state
            val image = capturedImage.value

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Button(
                    onClick = {
                        helloSdk.captureSelfie()
                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Capture Selfie")
                }

                Spacer(modifier = Modifier.height(16.dp))

                image?.let { bitmap ->
                    Image(
                        bitmap = bitmap.asImageBitmap(),
                        contentDescription = "Captured Selfie",
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    )
                }
            }
        }
    }
}
