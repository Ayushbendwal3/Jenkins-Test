pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './mvnw clean'
                sh './mvnw install'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
    }
}
