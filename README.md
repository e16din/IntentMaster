# IntentMaster
Simple way to start activity with your data

## Dependencies:
[appcompat-v7:23.3.0](http://developer.android.com/intl/ru/tools/support-library/features.html#v7-appcompat)

## Using

```java
//start with data
IntentMaster.startActivity(AuthActivity.this, MainActivity.class,
                                yourData);                              
//check extra
IntentMaster.hasExtra(this);

//get data
User user = (User) IntentMaster.getExtra(this);
```

## Download (Gradle)

```groovy
repositories {
    maven { url "https://jitpack.io" }
}

buildscript {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile 'com.github.e16din:IntentMaster:0.1.1'
}
```