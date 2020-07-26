import sbt._

object Dependencies {

  lazy val scalaTest  = "org.scalatest"  %% "scalatest"  % "3.0.5"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.0"

  lazy val cats       = "org.typelevel"  %% "cats-core"   % "2.0.0"
  lazy val catsEffect = "org.typelevel"  %% "cats-effect" % "2.1.4"

  lazy val zio        = "dev.zio"        %% "zio"         % "1.0.0-RC21-2"
  lazy val zioConfig  = "dev.zio"        %% "zio-config"  % "1.0.0-RC25"
  lazy val zioConfigTypesfe = "dev.zio" %% "zio-config-typesafe" % "1.0.0-RC25"

  lazy val fs2        = "co.fs2"         %% "fs2-core"    % "1.0.1"
  lazy val fs2IO      = "co.fs2"         %% "fs2-io"      % "1.0.1"

  lazy val atto       = "org.tpolecat"   %% "atto-core"   % "0.6.4"

}
