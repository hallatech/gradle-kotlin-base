# gradle-kotlin-base

A base configuration for a gradle plugin that includes the following components:

- a Groovy source plugin
- a Java source plugin
- a Kotlin source plugin

and corresponding tests for:

- Spock tests for Groovy
- JUnit4 and JUnit5 for Java
- Spek for Kotlin

The build logic of the plugin does nothing but print a message.
Later will add and test configurations DSL and tasks.

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

The inclusion of the following plugin in the buildscript causes the test reports not to be run and seems to have no other effect currently if commented out

        dependencies {
            classpath 'org.junit.platform:junit-platform-gradle-plugin:1.0.0'
        }

Default tasks will clean and build:

    defaultTasks 'clean', 'build'
    
Add the java-gradle-plugin to autogenerate the plugin manifests

# Functional Tests
Functional test added using Gradle testkit. For now these are just included in the default test source directories.
They can be later moved to functional source sets.

The functional test for Kotlin didn't work easily using Spek. The @Rule for the temporary folder didn't play well in Spek,
so workarounds using JvmFile or get annotations made no difference. Splitting into a separate inner class also never resolved 
and had the side effect of overwriting the project build file. So just reverted to standard Junit tests.

