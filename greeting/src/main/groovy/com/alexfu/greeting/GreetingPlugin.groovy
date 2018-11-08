package com.alexfu.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("hello") {
            doLast {
                println("Hello from GreetingPlugin")
            }
        }
    }
}
