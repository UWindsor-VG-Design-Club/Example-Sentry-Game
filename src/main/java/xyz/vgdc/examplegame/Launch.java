package xyz.vgdc.examplegame;

import github.chorman0773.sentry.test.TestLauncher;

import java.nio.file.Path;

public class Launch {

    public static void main(String[] args){
        Path run = Path.of(System.getProperty("user.dir"),"run");
        TestLauncher launcher = new TestLauncher(new ExampleGame(),run,args);
        launcher.initialize();
        launcher.run();
    }
}
