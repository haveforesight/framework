package com.xxx.utils;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class GenerateActivitiTable {
	
	@Test
	/**
	 * ���ɱ�ṹ
	 */
	public void main(){
		ProcessEngine processEngine =  ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();  
		System.out.println("processEngine="+processEngine);  
	}

}
