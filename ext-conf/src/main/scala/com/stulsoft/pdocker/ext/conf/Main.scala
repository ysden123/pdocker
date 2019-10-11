/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.pdocker.ext.conf

import com.typesafe.scalalogging.LazyLogging

/**
 * @author Yuriy Stul
 */
object Main extends App with LazyLogging {
  logger.info("==>ext-conf")

  logger.info(s"param1: ${AppConfig.param1}")
  logger.info(s"param2: ${AppConfig.param2}")

  logger.info("<==ext-conf")

}
