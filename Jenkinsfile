node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh 'docker stop a3b9ee57f94e'

    stage 'build'
        sh 'chmod 755 ./gradlew'
        sh './gradlew clean build'
}
