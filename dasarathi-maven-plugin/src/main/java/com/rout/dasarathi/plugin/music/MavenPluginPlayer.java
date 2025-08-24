package com.rout.dasarathi.plugin.music;

import javazoom.jl.player.Player;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Mojo(name = "music", defaultPhase = LifecyclePhase.VALIDATE, threadSafe = true)
public class MavenPluginPlayer extends AbstractMojo {
    protected static final AtomicInteger AIC = new AtomicInteger(0);

    private static final List<String> MUSIC_FILES = List.of(
            "RT1.mp3",
            "RT2.mp3",
            "RT3.mp3",
            "RT4.mp3");

    @Parameter(property = "skipMusic")
    protected boolean isMusicSkipped;

    public void execute() throws MojoExecutionException {

    }
}

