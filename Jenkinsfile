stage('Clone repository'){
    checkout scm
}

stage('start docker-compose'){
    sh 'docker-compose up -d --scale chrome=1 firefox=1 edge=1'
}

