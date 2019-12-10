# EasyMediaPicker
EasyMediaPicker
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.KarthikKompelli:EasyMediaPicker:1.0.4'
	}


Google has a new feature on Android 10 (Q): filtered view for external storage. A quick fix for that is to add this code in the AndroidManifest.xml file:

	<manifest ... >
        <!-- This attribute is "false" by default on apps targeting Android Q. -->
        <application android:requestLegacyExternalStorage="true" ... >
         ...
        </application>
    </manifest>

You can read more about it here: https://developer.android.com/preview/privacy/scoped-storage
