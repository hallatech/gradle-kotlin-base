package net.hallatech.gradle.plugin;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class JavaBasePlugin implements Plugin<Project> {

  private String greeting = "Java Base Plugin";

  @Override
  public void apply(Project target) {
    System.out.println(getGreeting());
  }

  public String getGreeting() {
    return greeting;
  }
}
