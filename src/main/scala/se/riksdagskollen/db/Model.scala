package se.riksdagskollen.db

/**
  * Created by johan on 2016-05-30.
  */
trait Model {
  def toMap: Map[String, Any]
}
