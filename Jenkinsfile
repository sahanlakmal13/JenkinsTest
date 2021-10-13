node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh 'docker build -t mytag .'
        sh './deploy.sh'

    stage 'build'
        sh 'mvn clean install'
}
