import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "app"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "mysql" % "mysql-connector-java" % "5.1.18",
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
