package com.stulsoft.pdocker.ext.typesafe.conf

import java.io.File

import com.typesafe.config.ConfigFactory

/**
 * @author Yuriy Stul
 */
object AppConfig {
  private lazy val config = ConfigFactory.parseFile(new File("application.conf"))
    .withFallback(ConfigFactory.load())

  def param1: String = config.getConfig("test").getString("param1")
}
