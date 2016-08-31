# IntentMaster
Simple way to start activity with your data

[![Release](https://jitpack.io/v/e16din/IntentMaster.svg)](https://jitpack.io/#e16din/IntentMaster)

## Dependencies:
[appcompat-v7:24.2.0](http://developer.android.com/intl/ru/tools/support-library/features.html#v7-appcompat)

## Using

```java
//Create data
User user = new User("Bruce Wein");

//Start activity
Start.activity(this, ProfileActivity.class, user);

//Create fragment
Create.fragment(new ProfileFragment(), user)

//Get data
User user = (User) Extra.get(this);


//Open intent
Open.map(...); 
Open.googleMap(...); 
//.. and others like phone, sms, etc

//Share link
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
