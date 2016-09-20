# IntentMaster
Simple way to start activity with your data

[![Release](https://jitpack.io/v/e16din/IntentMaster.svg)](https://jitpack.io/#e16din/IntentMaster)


## Usage

```java
//Create data
User user = new User("Bruce Wein");

//Start activity
Start.activity(this, ProfileActivity.class, user);

//or create fragment
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

## Download
Step 1. Add it in your root build.gradle at the end of repositories:
```groovy
    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```
Step 2. Add the dependency
```groovy
    dependencies {
        compile 'com.github.e16din:IntentMaster:0.3.1'
    }
```

## Dependencies:
[appcompat-v7:24.2.0](http://developer.android.com/intl/ru/tools/support-library/features.html#v7-appcompat)

## License MIT
Copyright (c) 2016 [Александр Кундрюков (e16din)](http://goo.gl/pzjc8x)

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

