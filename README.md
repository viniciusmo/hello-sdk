# Lucide Icons
An unofficial Lucide icons library for android. [visit](https://lucide.dev/icons/)

## Download

### Gradle

Add the dependency below to your **module**'s `build.gradle` (app) file:
```gradle
implementation("com.github.0xJihan:lucide-icons:1.0.1")
```

Add this in Setting.gradle
```gradle

 repositories {
        maven("https://jitpack.io")
    }
```


## Usage
`lucide.iconName`

For example, you can use the lucide-icons in a Jetpack Compose project as seen below:

```kotlin
  Icon(
        painter = painterResource(lucide.camera),
        contentDescription = null, 
        tint = Color.Red
    )
```

## License

```
Distributed under the MIT License

Copyright (c) 2024 Jihan

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
# hello-sdk
