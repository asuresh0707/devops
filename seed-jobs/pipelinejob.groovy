pipelineJob('git-checkout-pipeline_converted') {
  
  
  displayName('git-repo-checkout')
  
  configure { flowdefinition ->
    
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2.62') {
      
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git@3.9.1') {
        
        'configVersion'(2)
        
        'userRemoteConfigs' {
          
          'hudson.plugins.git.UserRemoteConfig' {
            
            'url'('https://github.com/asuresh0707/devops.git')
            
          }
          
        }
        
        'branches' {
          
          'hudson.plugins.git.BranchSpec' {
            
            'name'('*/master')
            
          }
          
        }
        
        'doGenerateSubmoduleConfigurations'(false)
        
        'submoduleCfg'(class:'list')
        
        'extensions'()
        
      }
      
      'scriptPath'('Jenkinsfile')
      
      'lightweight'(true)
      
    }
    
  }
  
}
