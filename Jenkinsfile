#!groovy


stage 'Download repo'

//git 'https://github.com/juribes/ci-project'

checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/juribes/ci-project']]])

cmd "dir"


dir('/complete') {
    // some block
}


stage 'create update schema'

cmd "pwd"