def call(String command) {

    if ("${command}" == "clean") {
        echo "Clean option selected"
    }
    else if ("${command}" == "build") {
        echo "Build option selected"
    }
    else if ("${command}" == "test") {
        echo "Test option selected"
    }
    else {
        echo "Unknown option: ${command}"
    }

}
