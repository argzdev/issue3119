# issue3119
### What product is affected?
- Firebase App Distribution
### Description
- Using latest version of App Distro `firebase-appdistribution-gradle:2.2.0` causes `"Val cannot be reassigned"` error when compiling. (See Summary for more info)
### Summary
- Assigning value to `uploadDistributionTask.appDistributionProperties` works in `firebase-appdistribution-gradle:2.1.0`
- Assigning value compilation fails in `firebase-appdistribution-gradle:2.2.0`
- Relevant Code: `uploadDistributionTask.appDistributionProperties = AppDistributionProperties(appDistributionExtension, project, variant)`
### How to use
- Running the code will instantly show that there is a compilation issue on line `uploadDistributionTask.appDistributionProperties = AppDistributionProperties(null, null, null)`
- Downgrading `com.google.firebase:firebase-appdistribution-gradle` from `2.2.0` to `2.1.0` in `{project}/buildSrc/build.gradle.kts` will make the project compile
