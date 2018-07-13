# gradle-kotlin-base

A base configuration for a gradle plugin that includes the following components:

- a Groovy source plugin
- a Java source plugin
- a Kotlin source plugin

and corresponding tests for:

- Spock tests for Groovy
- JUnit4 and JUnit5 for Java
- Spek for Kotlin

# Build

`build.gradle` is a default Groovy DSL based build file rather than a Kotlin DSL at this point.
It attempts to apply all types (language and framework) of tests in the same module - so far this works.

Adding the following only runs the Spek tests so is commented out

    junitPlatform {
        filters {
            engines {
                include 'spek'
            }
        }
    }

The inclusion of the following plugin in the buildscript causes the test reports not to be run and seems to have not other effect currently if commented out

        dependencies {
            classpath 'org.junit.platform:junit-platform-gradle-plugin:1.0.0'
        }

Default tasks will clean and build:

    defaultTasks 'clean', 'build'