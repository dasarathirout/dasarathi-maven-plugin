package com.rout.dasarathi.plugin.music;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MP3Player {
    private static final List<String> MUSIC_FILES = List.of(
            "RT1.mp3",
            "RT2.mp3",
            "RT3.mp3",
            "RT4.mp3");
    private static volatile boolean isPlayingNow= false;
    private static volatile int musicIndex= new Random().nextInt(MUSIC_FILES.size());
    private static final ExecutorService MP3_PLAYER_DAEMON_EXECUTOR;
    static {
        ThreadFactory daemonThreadFactory = runnable -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("Single-Daemon-Thread-MP3Player");
            return thread;
        };

        MP3_PLAYER_DAEMON_EXECUTOR = Executors.newSingleThreadExecutor(daemonThreadFactory);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("JVM is shutting down. Shutting Down The Daemon Executor: Single-Daemon-Thread-MP3Player.");
            MP3_PLAYER_DAEMON_EXECUTOR.shutdown();
        }));
    }
    public synchronized final void playMusic(final InputStream mp3InputStream) {
        Player player = null;
        try (BufferedInputStream mp3BufferedInputStream = new BufferedInputStream(mp3InputStream)) {
            player = new Player(mp3BufferedInputStream);
            player.play();
            player.isComplete();
        } catch (Exception e) {
            // Do Nothing
        } finally {
            if (player != null) {
                player.close();
            }
        }
    }

    public synchronized final void playMusic(final String resourceMP3File) {
        final InputStream mp3InputStream =
                MP3Player.class.getClassLoader().getResourceAsStream(resourceMP3File);
        playMusic(mp3InputStream);
    }

    public synchronized final void play() {
        MP3_PLAYER_DAEMON_EXECUTOR.submit(() -> {
            while (!isPlayingNow && !Thread.currentThread().isInterrupted()) {
                try {
                    isPlayingNow =true;
                    playMusic(MP3Player.class.getClassLoader().getResourceAsStream(MUSIC_FILES.get(musicIndex)));
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }finally {
                    isPlayingNow =false;
                }
            }
        });
    }
}
