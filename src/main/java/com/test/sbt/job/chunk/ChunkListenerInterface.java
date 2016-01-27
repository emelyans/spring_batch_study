package com.test.sbt.job.chunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ChunkListenerInterface implements ChunkListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeChunk(ChunkContext context) {
        logger.debug("beforeChunk: {}", context);
    }

    public void afterChunk(ChunkContext context) {
        logger.debug("afterChunk: {}", context);
    }

    public void afterChunkError(ChunkContext context) {
        logger.debug("afterChunkError: {}", context);
    }

}
