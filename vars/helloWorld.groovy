def call(Map config = [:]) {
    echo " Hello ${config.name}. Today is ${config.dayOfWeek}. It is my local version from bitbucket repo"
}