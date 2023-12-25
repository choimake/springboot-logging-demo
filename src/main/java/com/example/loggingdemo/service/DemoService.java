package com.example.loggingdemo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public final class DemoService {
  private static final Log LOGGER = LogFactory.getLog(DemoService.class);

  public void execute() {
    String message = "This line was written to the log.";
    String secondMessage = "This line was also written to the log with the same Trace ID.";
    LOGGER.info(message);
    LOGGER.info(secondMessage);
  }
}
