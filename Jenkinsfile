pipeline
{
    agent any

    tools{
        maven 'maven'
        }

    stages
    {
        stage('Build')
        {
            steps
            {
                 git 'https://github.com/jglick/simple-maven-project-with-tests.git'
                 sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            post
            {
                success
                {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }


        stage("Deploy to Dev"){
            steps{
                echo("deploy to Dev")
            }
        }

        stage('Sanity API Automation Test on DEV') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/BikramChatterjee9/NaveenAPI.git'
                    sh "mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testrunners/testng.xml"

                }
            }
        }



        stage("Deploy to QA"){
            steps{
                echo("deploy to qa done")
            }
        }



        stage("Deploy to Stage"){
            steps{
                echo("deploy to Stage")
            }
        }


        stage("Deploy to PROD"){
            steps{
                echo("deploy to PROD")
            }
        }


    }
}