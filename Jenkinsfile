node{
    args '-v /var/run/docker.sock:/var/run/docker.sock'

    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'build'
        docker.build('selenoid-ui')

    stage 'deploy'
        sh './deploy.sh'

}