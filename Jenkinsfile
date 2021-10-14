node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'build'
        sh 'chmod 755 ./gradlew'
        sh './gradlew clean build'

}
