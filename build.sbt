lazy val proj1 = (project in file("proj1"))
lazy val proj2 = (project in file("proj2")).dependsOn(proj1)
