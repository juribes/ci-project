#!groovy

node(jenkins) {
	stage 'Download repo'
	
    cmd "pwd"
    dir('common') {
        git url: 'https://github.com/juribes/ci-project'
    }
//git 'https://github.com/juribes/ci-project'

//checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/juribes/ci-project']]])

cmd "dir"


dir('/complete') {
    // some block
}


stage 'building app'

cmd "pwd"