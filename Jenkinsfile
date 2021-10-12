pipeline {
    agent any
    stages {
        stage('Clone repository') {
            steps {
                checkout scm
            }
        }

        stage('start docker-compose'){
            steps {
                sh 'cd src'
                sh 'docker-compose -f docker-compose.yml up'
            }
        }
    }
}