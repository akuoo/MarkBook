package com.github.akuoo.markbook.services

import com.intellij.openapi.project.Project
import com.github.akuoo.markbook.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
