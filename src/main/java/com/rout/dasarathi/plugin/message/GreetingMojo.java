package com.rout.dasarathi.plugin.message;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "message")
public class GreetingMojo extends AbstractMojo {

    private static final String STAR_LINE="★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★";
    private static final String PLUGIN_MESSAGE="★                        Hello... Maven Plugin!                        ★";

    @Override
    public void execute() throws MojoExecutionException {
        getLog().info(STAR_LINE);
        getLog().info(PLUGIN_MESSAGE);
        getLog().info(STAR_LINE);
    }
}