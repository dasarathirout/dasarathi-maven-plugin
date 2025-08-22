package com.rout.dasarathi.plugin.message;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Mojo(name = "message")
public class GreetingMojo extends AbstractMojo {

  private static final String MESSAGE_FILE = "message.txt";
  private static final String STAR_LINE =
      "★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★";
  private static final String PLUGIN_MESSAGE =
      "★                        Hello... Maven Plugin!                        ★";

  @Override
  public void execute() throws MojoExecutionException {
    getLog().info(STAR_LINE);
    getLog().info(PLUGIN_MESSAGE);
    getLog().info(STAR_LINE);

      logMessageFile();
  }

  void logMessageFile() {
    final InputStream inputStream = getClass().getClassLoader().getResourceAsStream(MESSAGE_FILE);
    if (inputStream == null) {
        // DO NOTHING
    } else {

      try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
        final String messageContents = reader.lines().collect(Collectors.joining(System.lineSeparator()));
        getLog().info(messageContents);
      } catch (Exception e) {
        // DO NOTHING
      }
    }
  }
}
