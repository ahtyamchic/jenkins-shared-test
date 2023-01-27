def call(Map config = [:]) {
    echo  "Hello my dear ${config.name}. Today is ${config.dayOfWeek}. This fucking jenkins shared lib is working."
}
