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
                sh 'docker-compose -f docker-compose.yml up'
            }
        }
    }
}