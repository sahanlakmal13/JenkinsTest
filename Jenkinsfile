node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh 'docker ps'

    stage 'build'
        sh 'chmod 755 ./gradlew'
        sh './gradlew clean build'
}
