name := "mulimodule-main"

version := "0.1"

scalaVersion := "2.12.3"

lazy val common = project
  .settings(scalaVersion := "2.12.3")

lazy val other = project
  .settings(scalaVersion := "2.12.3")

