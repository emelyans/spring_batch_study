package com.test.sbt.job.chunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.*;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ChunkListenerAnnotations {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeChunk
    public void beforeChunk(ChunkContext context) {
        logger.debug("beforeChunk: {}", context);
    }

    @AfterChunk
    public void afterChunk(ChunkContext context) {
        logger.debug("afterChunk: {}", context);
    }

    @AfterChunkError
    public void afterChunkError(ChunkContext context) {
        logger.error("afterChunkError: {}", context);
    }
}
