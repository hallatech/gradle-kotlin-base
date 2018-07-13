package net.hallatech.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GroovyBasePlugin implements Plugin<Project> {

  def greeting = "Groovy Base Plugin"

  @Override
  void apply(Project project) {
    println(greeting)
  }

}
