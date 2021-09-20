package com.github.hazerhazer.intellijjacy.services

import com.intellij.openapi.project.Project
import com.github.hazerhazer.intellijjacy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
