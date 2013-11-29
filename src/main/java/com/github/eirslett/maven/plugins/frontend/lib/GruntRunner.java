package com.github.eirslett.maven.plugins.frontend.lib;

import org.slf4j.Logger;

import java.io.File;

public interface GruntRunner {
    public void execute(String args) throws TaskRunnerException;
}

final class DefaultGruntRunner extends NodeTaskExecutor implements GruntRunner {
    private static final String TASK_NAME = "grunt";
    private static final String TASK_LOCATION = "/node_modules/grunt-cli/bin/grunt";

    DefaultGruntRunner(Logger logger, Platform platform, File workingDirectory) {
        super(TASK_NAME, TASK_LOCATION, workingDirectory, platform, logger);
    }
}
