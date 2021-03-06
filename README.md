# PreferencesHelper
[![Build Status](https://travis-ci.org/NikolayManzhos/PreferencesHelper.svg?branch=master)](https://travis-ci.org/NikolayManzhos/PreferencesHelper)
[![codecov](https://codecov.io/gh/NikolayManzhos/PreferencesHelper/branch/master/graph/badge.svg)](https://codecov.io/gh/NikolayManzhos/PreferencesHelper)
## Getting started
In app `build.gradle`:
```gradle
dependencies {
    implementation 'com.nikolaymanzhos:preferenceshelper:2.4'
}
```
Setup library in `Application` class:
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
## Bonus
Ability to store ```List<String>```.<br />
Just call ```PreferencesHelper#putStringList``` and you are good to go!
## Usage
After ```PreferencesHelper``` has been initialized you can access preferences from any place.<br />
Just call ```PreferencesHelper.getInstance()```.

To keep all preferences in single place create new class and extend it form ```DefaultPreferencesManager``` class.
Inside your new class you'll have access to preferences by calling ```getPreferencesHelper()``` method.

## Advanced
Set custom properties for your preference storage.
```java
PreferencesHelper.builder(this)
        .setMode(ContextWrapper.MODE_PRIVATE)
        .setName("MyPrefs")
        .build();
```