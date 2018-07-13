package net.hallatech.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

open class KotlinBasePlugin : Plugin<Project> {

  val greeting = "Kotlin Base Plugin"

  override fun apply(target: Project?) {
    println(greeting)
  }

}