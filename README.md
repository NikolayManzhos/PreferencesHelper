# PreferencesHelper
[![Build Status](https://travis-ci.org/NikolayManzhos/PreferencesHelper.svg?branch=master)](https://travis-ci.org/NikolayManzhos/PreferencesHelper)
[![codecov](https://codecov.io/gh/NikolayManzhos/PreferencesHelper/branch/master/graph/badge.svg)](https://codecov.io/gh/NikolayManzhos/PreferencesHelper)
## Getting started
In your project `build.gradle`:
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
In app `build.gradle`:
```gradle
dependencies {
    compile 'com.github.nikolaymanzhos:preferenceshelper:2.0'
}
```
Finally create instance in `Application` class:
```java
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesHelper.builder(this)
                .build();
    }
}
```
## Usage
After ```PreferencesHelper``` has been build you can access preferences from any place.
Just call ```PreferencesHelper.getInstance()```.

To keep all preferences in single place create new class and extend it form ```DefaultPreferencesManager``` class.
Inside your new class you'll have access to preferences by calling ```getPreferencesHelper()``` method.

## Advanced
Set custom properties for your preference storage.
Full list of the available modes
```java
PreferencesHelper.builder(this)
        .setMode(ContextWrapper.MODE_PRIVATE)
        .setName("MyPrefs")
        .build();
```