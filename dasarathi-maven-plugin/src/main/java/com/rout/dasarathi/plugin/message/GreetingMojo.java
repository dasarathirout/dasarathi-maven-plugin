package com.rout.dasarathi.plugin.message;

import com.rout.dasarathi.plugin.message.arts.ArtMessenger;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Mojo(name = "message", defaultPhase = LifecyclePhase.VALIDATE)
public class GreetingMojo extends AbstractMojo {

    private static final String MESSAGE_FILE = "message.txt";
    private static final String STAR_LINE =
            "★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★";
    private static final String PLUGIN_MESSAGE =
            "★                        Hello... Maven Plugin!                        ★";


    @Parameter(property = "skipMessageBanner")
    protected boolean isMessageSkipped=false;

    @Parameter(property = "userMessage")
    protected String userMessage = "";

    @Override
    public void execute() throws MojoExecutionException {
        //logMessageFile(); // Log From ArtManager
        getLog().info(STAR_LINE);
        getLog().info(PLUGIN_MESSAGE);
        if(this.userMessage.isBlank()){
            ArtMessenger.logTextArtMessage("Maven-v3");
        }else {
            ArtMessenger.logTextArtMessage(userMessage);
        }
        getLog().info(STAR_LINE);
    }

    void logMessageFile() {
        final InputStream inputStream = getClass().getClassLoader().getResourceAsStream(MESSAGE_FILE);
        if (inputStream == null) {
            // DO NOTHING
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                final String messageContents =
                        reader.lines().collect(Collectors.joining(System.lineSeparator()));
                getLog().info(messageContents);
            } catch (Exception e) {
                // DO NOTHING
            }
        }
    }
}
