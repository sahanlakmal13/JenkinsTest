node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'build'
        docker.build('selenoid')

    stage 'deploy'
        sh './deploy.sh'
}