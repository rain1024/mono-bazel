package com.example

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import java.util.Random

class MainVerticle : AbstractVerticle() {

    override fun start() {
        val router = Router.router(vertx)

        router.get("/").handler(this::handleHello)

        vertx.createHttpServer().requestHandler(router).listen(5000)
    }

    private fun handleHello(routingContext: RoutingContext) {
        val random = Random()
        val num1 = random.nextInt(100) + 1
        val num2 = random.nextInt(100) + 1

        val result = Calculator().add(num1, num2)

        val response = "Do you know $num1 + $num2 = $result?"
        routingContext.response().end(response)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val vertx = Vertx.vertx()
            vertx.deployVerticle(MainVerticle())
        }
    }
}