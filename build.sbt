name := "serber"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  //anorm,
  "com.typesafe.play" %% "play-slick" % "0.5.0.8",
  cache
)

play.Project.playScalaSettings
