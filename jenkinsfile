pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'scientificcalculator'
        GITHUB_REPO_URL = 'https://github.com/AnkitaAgrawal12/SPE_miniproject.git'
    }

    stages {
          stage('Cleanup') {
            steps {
                script{   
                // Remove specific Docker containers
                sh 'docker rm -f scientificcalculator'
                }
            }
        }
        
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'master', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag scientificcalculator ankitaagrawal12/scientificcalculator:latest'
                    sh 'docker push ankitaagrawal12/scientificcalculator'
                    }
                 }
            }
        }

   stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }

    }
}
