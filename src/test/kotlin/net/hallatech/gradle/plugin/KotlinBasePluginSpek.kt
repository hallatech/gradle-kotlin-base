package net.hallatech.gradle.plugin

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object KotlinBasePluginSpek : Spek({
  given("a base plugin") {
    val plugin = KotlinBasePlugin()
    on("get greeting") {
      val greeting = plugin.greeting
      it("should return the base plugin greeting") {
        assert(greeting == "Kotlin Base Plugin")
      }
    }
  }
})