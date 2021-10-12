node{
    stage 'Checkout'{
        git url: 'https://github.com/sahanlakmal13/JenkinsTest.git'
    }
    stage 'build'{
        docker.build('selenoid-ui')
    }
    stage 'deploy'{
        sh './deploy.sh'
    }
}