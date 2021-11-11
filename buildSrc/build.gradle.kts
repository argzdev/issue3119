plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}
dependencies {
    // This version works
//    implementation("com.google.firebase:firebase-appdistribution-gradle:2.1.0")
    // This version causes compilation issue
    implementation("com.google.firebase:firebase-appdistribution-gradle:2.2.0")
}

gradlePlugin {
    plugins {
        create("BuildManager") {
            id = "com.argz.plugin"
            implementationClass = "BuildManager"
            version = "1.0.0"
        }
    }
}