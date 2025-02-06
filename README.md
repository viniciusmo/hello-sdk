# Hello SDK: Anti-Fraud Selfie Validation SDK

**Hello SDK** is an anti-fraud SDK designed to validate selfies as part of a secure user verification process. It integrates seamlessly with your Android application and leverages our advanced anti-fraud system to ensure that the selfie meets the required security standards.

## Installation

Hello SDK is published to a Maven repository, add the dependency in your build.gradle file as follows:

```groovy
dependencies {
    implementation "com.hello:sdk:1.0.0"
}
```
### How To Use

```kotlin
 val helloSdk = HelloSdk(
            activity = this,
            onSuccess = { bitmap ->
                capturedImage.value = bitmap
            },
            onFailed = { exception ->
                Log.e("MainActivity", "Selfie capture failed: ${exception.message}")
            }
        )
```