/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.server

import java.net.InetSocketAddress

import com.sun.net.httpserver.{HttpExchange, HttpHandler, HttpServer}

/**
 * @author Yuriy Stul
 */
object Main extends App {
  try {
    val port = 8080
    val server = HttpServer.create(new InetSocketAddress(port), 0)
    server.createContext("/", new Handler)
    server.setExecutor(null)

    server.start()

    println(s"HTTP server is started on $port")

    sys.addShutdownHook{
      println("Stopping server ...")
      server.stop(0)
    }
  }catch{
    case ex:Exception=>
      println(s"Failure: ${ex.getMessage}")
  }
}

class Handler extends HttpHandler {
  override def handle(exchange: HttpExchange): Unit = {
    println("==>handle")
    val response = "Hello from Docker HTTP server!"
    exchange.sendResponseHeaders(200, response.length)
    val outputStream = exchange.getResponseBody
    outputStream.write(response.getBytes)
    outputStream.close()
  }
}
