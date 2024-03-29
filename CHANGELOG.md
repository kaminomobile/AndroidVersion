# Change Log

## Version 3.2.0

Updated to Kotlin 1.6.10 and AGP 7.1.0

## Version 3.1.0

Made actual reading of files run in execution time instead of configuration time (even with lazy {}). Bumped gradle to 7.3.1 and AGP to 7.0.3.

## Version 3.0.3

Bumped AGP version to stable 7.0.2 and kotlin to 1.5.30

## Version 3.0.2

Added support for gradle config cache and updated example project to use it. This meant that tasks must not use project (as well as other stuff) in execution time.

## Version 2.1.2 *(2021-5-27)*

 * AGP 7.0.0-beta02 support.

## Version 2.1.1 *(2021-5-6)*

 * Gradle 7 support.

## Version 1.8.2 *(2020-01-28)*

 * Removing unnecessary logs.

## Version 1.8.1 *(2020-01-28)*

 * Do not require application plugin to be added before version plugin.
 * Plugin does not support library and test plugins any more.
 * Warn instead of crash when android application plugin is not present.4

## Version 1.8.0 *(2020-01-26)*

 * Support for kotlin dsl.

## Version 1.6.0 *(2019-04-26)*

 * Support for version name suffix.

## Version 1.6.0 *(2019-04-10)*

 * Adding support for reading versionCode as separate property in file.
 * Moving to task providers.

## Version 1.5.1 *(2017-12-26)*

 * Fix for extending version

## Version 1.5.0 *(2017-11-29)*

 * Reading version code from properties file

## Version 1.4.0 *(2017-11-16)*

 * Disabled when under instant run.

## Version 1.3.2 *(2017-11-10)*

 * Adding support for Android Gradle plugin 3.1.0.
 * Plugin does no longer bring in Android Gradle plugin dependency.

## Version 1.3.1 *(2017-10-31)*

 * Fixing splits configuration issues.
 * Requires Gradle 4.2 or above.

## Version 1.2.6 *(2017-10-12)* **should be 1.3.0 buy was not for some reason :)**

 * Adding DigitsVersionCode
 * Moving away from gradle internal APIs

## Version 1.2.4 *(2017-08-28)*

 * Fixing support for Android gradle plugin 3.0.0 alpha 2.

## Version 1.2.3 *(2017-05-30)*

 * Addng support for Android gradle plugin 3.0.0.

## Version 1.2.2 *(2017-01-31)*

 * Typo fixes. ¯\\\_(ツ)_/¯

## Version 1.2.0 *(2017-01-31)*

 * Adding per build type version configuration.
 * Adding flavor combination version configuration. [Read more](https://github.com/kaminomobile/AndroidVersion#flavor-combinations)

## Version 1.1.0 *(2017-01-30)*

 * Adding pattern based ability to rename output file. [Read more](https://github.com/kaminomobile/AndroidVersion#output-file-name)

## Version 1.0.1 *(2017-01-27)*

 * Removing instant run workaround for new Android Gradle plugin versions

## Version 1.0.0 *(2017-01-23)*

 * Initial release  
