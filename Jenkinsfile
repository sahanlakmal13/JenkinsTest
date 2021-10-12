node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh './deploy.sh'

    stage 'build'
        sh './gradlew clean build'

    stage 'test'
        sh 'docker ps'
}