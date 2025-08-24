package com.rout.dasarathi.plugin.music;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "music", defaultPhase = LifecyclePhase.VALIDATE, threadSafe = true)
public class MavenPluginPlayer extends AbstractMojo {
    @Parameter(property = "skipMusic")
    protected volatile boolean isMusicSkipped;

    public void execute() throws MojoExecutionException {
        if (isMusicSkipped) {
            getLog().info("Maven Plugin Music Player SKIPPED.");
        } else {
            synchronized (MP3Player.class) {
                getLog().info("Maven Plugin Music Player ...");
                new MP3Player().play();
            }
        }
    }
}

