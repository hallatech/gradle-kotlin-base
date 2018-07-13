package net.hallatech.gradle.plugin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBasePluginJUnit4Test {

  @Test
  public void getGreetingTest() {
    JavaBasePlugin plugin = new JavaBasePlugin();
    assertEquals("Greeting not found", plugin.getGreeting(), "Java Base Plugin");
  }
}
