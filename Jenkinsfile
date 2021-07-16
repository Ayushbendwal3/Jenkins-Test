pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                git 'https://github.com/Ayushbendwal3/Jenkins-Test.git'
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