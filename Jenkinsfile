def groovy_scripts

pipeline {

    agent any

    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Version of The App')
    }

    stages {
        stage("init"){
            steps{
                script {
                    groovy_scripts = load 'scripts/main.groovy'
                }
            }
        }
        stage("test"){
            steps {
                script {
                    groovy_scripts.executeTests()
                }
            }
        }

        stage("build"){
            steps {
                script {
                    groovy_scripts.build()
                }
            }
        }

        stage("deploy"){
            steps {
                script {
                    groovy_scripts.deploy()
                }
            }
        }
    }
}