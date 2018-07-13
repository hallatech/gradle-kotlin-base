package net.hallatech.gradle.plugin

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.GradleRunner
import static org.gradle.testkit.runner.TaskOutcome.SUCCESS

import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.Specification

class GroovyBasePluginFunctionalSpec extends Specification {

  @Rule
  final TemporaryFolder testProjectDir = new TemporaryFolder()
  File buildFile

  def setup() {
    buildFile = testProjectDir.newFile('build.gradle')
  }

  def "included plugin prints greeting to console"() {
    given:
    buildFile << """
      plugins {
        id 'net.hallatech.groovy-base-plugin'
      }
"""
    when:
    def result = runGradleTasksListing()

    then:
    result.output.contains("Groovy Base Plugin")
    result.task(":tasks").outcome == SUCCESS

  }

  private BuildResult runGradleTasksListing() {
    GradleRunner.create()
        .withProjectDir(testProjectDir.root)
        .withArguments('tasks')
        .withPluginClasspath()
        .build()
  }
}
