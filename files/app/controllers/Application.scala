package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val logger = play.api.Logger("tester")

    val envVar = play.api.Play.current.configuration.getString("test.env.var").getOrElse("???")
    logger.warn(envVar)
    logger.info(envVar)
    logger.debug(envVar)
    logger.trace(envVar)
    Ok(views.html.index("Your new application is ready."))
  }

}