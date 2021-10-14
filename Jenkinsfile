pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/sahanlakmal13/JenkinsTest.git'
                sh 'docker-compose down'
                sh 'docker-compose up -d'
            }
        }
        stage('Test') {
            steps {
                withGradle(){
                    sh './gradlew clean test'
                }
            }
        }
    }
}