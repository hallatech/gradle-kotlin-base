package net.hallatech.gradle.plugin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaBasePluginJUnit5Test {

  @Test
  @DisplayName("java plugin greeting test")
  void getGreetingTest() {
    JavaBasePlugin plugin = new JavaBasePlugin();
    assertEquals("Java Base Plugin", plugin.getGreeting());
  }
}
