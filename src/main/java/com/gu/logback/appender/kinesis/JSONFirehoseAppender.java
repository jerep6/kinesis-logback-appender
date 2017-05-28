/*******************************************************************************
 * Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 ******************************************************************************/

package com.gu.logback.appender.kinesis;

import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * LOGBack Appender implementation to support sending data from java
 * applications directly into a Kinesis Firehose stream.
 * 
 * More details are available
 * <a href="https://github.com/guardian/kinesis-logback-appender">here</a>
 * 
 * @since 1.4
 */
public class JSONFirehoseAppender<Event extends ILoggingEvent> extends FirehoseAppender<Event> {

  public JSONFirehoseAppender() {
    setJsonLogging(true);
  }
}
