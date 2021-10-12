node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh './deploy.sh'

    withGradle
        sh 'chmod 755 ./gradlew'
        sh './gradlew clean build'

    stage 'test'
        sh 'docker ps'
}