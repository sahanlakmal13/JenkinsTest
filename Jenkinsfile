node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${HOST_JENKINS_DATA.WORKSPACE}"
        sh './deploy.sh'
}