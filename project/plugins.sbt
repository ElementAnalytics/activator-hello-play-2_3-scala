// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3-M1")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0-M2a")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.0-M2a")
