node{
stage('SCM Checkout')
{
git 'https://github.com/sumit9090/pipeline_testing'
}
stage('Compile-Package')
{def mvnHome=tool name: 'Default', type: 'maven'
echo "${mvnHome/bin/mvn package"
}
}
