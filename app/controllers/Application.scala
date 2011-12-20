package controllers

import play.mvc.Controller


object Application extends Controller {
  import views.Application._
  def index = {
    html.index("My app!")
  }
}