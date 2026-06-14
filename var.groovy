def call(String command) {

    if ("${command}" == "clean") {
        sh 'echo "Running CLEAN"'
    }
    else if ("${command}" == "build") {
        sh 'echo "Running BUILD"'
    }
    else if ("${command}" == "test") {
        sh 'echo "Running TEST"'
    }
    else {
        sh "echo 'Unknown option: ${command}'"
    }

}
