pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/sahanlakmal13/JenkinsTest.git'
            }
        }
        stage('Test') {
            steps {
                sh 'chmod 755 ./gradlew'
                withGradle(){
                    sh './gradlew clean build'
                }
            }
        }
    }
}
