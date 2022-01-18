package com.poscoict.biztrip.recvmodules;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poscoict.biztrip.domain.employeeboss.EmployeeBoss;
import com.poscoict.biztrip.domain.employeeboss.EmployeeBossRepository;
import com.poscoict.biztrip.service.BizTripService;
import com.poscoict.biztrip.web.dto.EmpBossRabbit;

@Component
class RecvModule {
	@Autowired
	BizTripService bizTripService;
	@Autowired
	EmployeeBossRepository employeeBossRepository;
	@RabbitListener(bindings = @QueueBinding(
			exchange = @Exchange(
					name = "Exchange", type = ExchangeTypes.TOPIC), 
			value = @Queue(name = "empbossSignup"), // 받는놈의 키																																					// 키
			key = "empboss")) // 주는놈의 키
	
	public void receiver(String empbossJson) throws JsonMappingException, JsonProcessingException {
	    ObjectMapper objectMapper = new ObjectMapper();
	    
		EmpBossRabbit empBossDto = objectMapper.readValue(empbossJson, EmpBossRabbit.class);
		
		System.out.println("goaldae: :"+empBossDto.toString());
		
		EmployeeBoss empBoss = new EmployeeBoss(empBossDto.getId(), empBossDto.getBid());
		
		employeeBossRepository.save(empBoss);
	}
}