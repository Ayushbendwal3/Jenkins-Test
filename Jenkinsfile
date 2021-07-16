pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './mvnw clean'
                sh './mvnm compile'
                sh './mvnm install'
            }
        }
        stage('test') {
            steps {
                sh './mvnm test'
            }
        }
    }
}
