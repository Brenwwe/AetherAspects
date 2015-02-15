@echo off
title Aether Aspects Workspace Setup

:: Call Gradle Setup
call gradlew setupDecompWorkspace eclipse
pause