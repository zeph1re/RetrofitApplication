# RetrofitApplication

Retrofit Application With Jetpack Compose, Depedency Injection, and MVVM

### How to run this app
```
Build -> Make Project
```

### Run this app with your own signing bundle
```
Build -> Generate Sign Bundle /APK
```
Install manually to your emulator/device
```kotlin
adb install app/release/app-release.apk
```



### Issue

The Application with retrofit2 can't run to Android device version 12 or above.

``` Error
Process: com.example.retrofitapplication, PID: 4868
                                                                                                    java.lang.IllegalArgumentException: com.example.retrofitapplication: Targeting S+ (version 31 and above) requires that one of FLAG_IMMUTABLE or FLAG_MUTABLE be specified when creating a PendingIntent.
                                                                                                    Strongly consider using FLAG_IMMUTABLE, only use FLAG_MUTABLE if some functionality depends on the PendingIntent being mutable, e.g. if it needs to be used with inline replies or bubbles.
```



