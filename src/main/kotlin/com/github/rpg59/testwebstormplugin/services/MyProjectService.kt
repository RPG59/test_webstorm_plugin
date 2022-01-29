package com.github.rpg59.testwebstormplugin.services

import com.intellij.openapi.project.Project
import com.github.rpg59.testwebstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
