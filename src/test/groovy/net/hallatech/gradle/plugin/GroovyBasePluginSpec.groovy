package net.hallatech.gradle.plugin

import spock.lang.*

class GroovyBasePluginSpec extends Specification {

  def 'groovy plugin greeting test'() {
    when: GroovyBasePlugin plugin = new GroovyBasePlugin()
    then: plugin.greeting == "Groovy Base Plugin"
  }
}
