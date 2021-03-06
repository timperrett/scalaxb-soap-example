package eu.getintheloop.sample

import scalaxb._

object Main {
  def main(args: Array[String]): Unit = {
    
    val remote = new WeatherSoap12Bindings with SoapClients with DispatchHttpClients {}
    
    println {
      remote.service.getWeather(Some("New York"))
    }
  }
}