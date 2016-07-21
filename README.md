# IntentMaster
Simple way to start activity with your data

[![Release](https://jitpack.io/v/e16din/IntentMaster.svg)](https://jitpack.io/#e16din/IntentMaster)

## Dependencies:
[appcompat-v7:24.0.0](http://developer.android.com/intl/ru/tools/support-library/features.html#v7-appcompat)

## Using

```java
//start with data
IntentMaster.start(AuthActivity.this, MainActivity.class,
                                yourData);   
//or new way
Start.activity(AuthActivity.this, MainActivity.class,
                                yourData);  

//check extra
IntentMaster.hasExtra(this);
//or new way
Extra.has(this);

//get data
User user = (User) IntentMaster.getExtra(this);
//or new way
User user = (User) Extra.get(this);

//open map
Open.map(...); 
//open google map
Open.googleMap(...); 
//.. and others like phone, sms, etc

//share link
Share.link(context, link);

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
    compile 'com.github.e16din:IntentMaster:0.+'
}
```