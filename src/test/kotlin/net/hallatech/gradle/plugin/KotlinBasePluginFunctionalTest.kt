package net.hallatech.gradle.plugin

import org.gradle.testkit.runner.GradleRunner
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class KotlinBasePluginFunctionalTest {

  @get:Rule
  val temporaryFolder = TemporaryFolder()

  @Before
  fun setup() {
    temporaryFolder.newFile("build.gradle").printWriter().use { out ->
      out.println("plugins {")
      out.println("    id 'net.hallatech.kotlin-base-plugin'")
      out.println("}")
    }
  }

  @Test
  fun `plugin generates greeting on tasks invocation`() {

    val result = GradleRunner.create()
      .withProjectDir(temporaryFolder.root)
      .withArguments("tasks")
      .withPluginClasspath()
      .build()

    assert(result.output.contains("Kotlin Base Plugin"))
  }

}