package com.stulsoft.pdocker.ext.typesafe.conf

import com.typesafe.scalalogging.LazyLogging

/**
 * @author Yuriy Stul
 */
object Main extends App with LazyLogging {
  logger.info("==>ext-conf")

  logger.info(s"param1: ${AppConfig.param1}")

  logger.info("<==ext-conf")

}
