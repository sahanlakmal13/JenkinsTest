node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh './deploy.sh'

    stage 'build'
        sh 'chmod 755 ./gradlew'
        sh './gradlew clean build'
}
