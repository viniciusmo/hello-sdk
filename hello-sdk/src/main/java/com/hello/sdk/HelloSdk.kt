package com.hello.sdk

import android.graphics.Bitmap
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class HelloSdk(
    activity: ComponentActivity,
    private val onSuccess: (Bitmap) -> Unit,
    private val onFailed: (Exception) -> Unit
) {
    private val launcher: ActivityResultLauncher<Void?> =
        activity.registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap: Bitmap? ->
            if (bitmap != null) {
                onSuccess(bitmap)
            } else {
                onFailed(Exception("Selfie capture failed: Bitmap is null"))
            }
        }

    fun captureSelfie() {
        launcher.launch(null)
    }
}
