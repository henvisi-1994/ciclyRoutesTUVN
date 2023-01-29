name := """ciclyRoutesTUVN-api"""
organization := "com.tuvn"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.10"
libraryDependencies += guice
libraryDependencies += ws
// Mysql
libraryDependencies += javaJdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.32"
libraryDependencies += "com.auth0" % "java-jwt" % "3.3.0"


resolvers += Resolver.bintrayRepo("playframework", "maven")