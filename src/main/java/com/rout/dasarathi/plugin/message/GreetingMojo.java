package com.rout.dasarathi.plugin.message;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "message")
public class GreetingMojo extends AbstractMojo {

    private static final String LINE="★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★";
    private static final String MESSAGE="★★              HELLO.. MAVEN WORLD!            ★★";

    @Override
    public void execute() throws MojoExecutionException {
        getLog().info(LINE);
        getLog().info(MESSAGE);
        getLog().info(LINE);
    }
}