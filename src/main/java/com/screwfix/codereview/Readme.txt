
stage ('Create and pull main folder') {
			git 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/virtualPairstationVagrantBase.git'
		}
		stage ('Create Ansible/group_vars folder') {
			dir('Ansible/group_vars') {
				git 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/group_vars.git'
			}
		}
		stage ('Create Ansible/playbooks/pairstation_vm folder') {
			dir('Ansible/playbooks/pairstation_vm') {
				git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/playbooks/pairstation_vm.git'
			}
		}
		stage ('Create Ansible/roles folder') {
			dir('Ansible') {
				dir('roles') {
                    dir('docker') { git 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/docker.git' }
					dir('slack') { git 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/slack.git' }
					dir('apache') { git 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/apache.git' }
					dir('atg10.1') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/atg10.1.git'}
					dir('devPsTools') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/devPsTools.git'}
					dir('java_1.6') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/java_1.6.git'}
					dir('java_8') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/java_8.git'}
					dir('oracleExpress') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/oracleExpress.git'}
					dir('oracleWeblogic11g') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/oracleWeblogic11g.git'}
					dir('oracleXE11g') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/oracleXE11g.git'}
					dir('oracle_client') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/oracle_client.git'}
					dir('personal') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/personal.git'}
					dir('rawlDeployTool') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/rawlDeployTool.git'}
					dir('ruby') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/ruby.git'}
					dir('sitebuilderImport') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/sitebuilderImport.git'}
					dir('xrdp') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/xrdp.git'}
					dir('eclipse') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/eclipse.git'}
                    dir('jenkins') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/jenkins.git'}
					dir('testingPsTools') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/testingPsTools.git'}
					dir('intellij') { git url: 'git@vuxdev01.ondc.screwfix.local:repos/Ansible/roles/intellij.git'}
				}
				dir('playbooks/pairstation_vm') {
					sh 'chmod 600 insecure_private_key'
				}
			}
		}