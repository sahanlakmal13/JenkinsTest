node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'build'
        docker.deploy('selenoid')

    stage 'deploy'
        sh './deploy.sh'
}