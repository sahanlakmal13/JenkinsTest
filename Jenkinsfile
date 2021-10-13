node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh 'service docker start'
        sh './deploy.sh'

    stage 'build'
        sh 'mvn clean install'
}
