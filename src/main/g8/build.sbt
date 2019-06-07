organization := "$package$"
scalaVersion := "2.12.8"

name := "$name$"

lazy val semod = RootProject(uri("https://github.com/smeagol74/semod.git"))

libraryDependencies += "net.sourceforge.plantuml" % "plantuml" % "1.2019.7" from "https://github.com/smeagol74/semod/raw/master/lib/plantuml-1.2019.7-SNAPSHOT.jar"

lazy val root = (project in file(".")).dependsOn(semod)