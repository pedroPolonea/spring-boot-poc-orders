package com.orders;

import com.orders.entity.OrderEntity;
import com.orders.entity.SellerEntity;
import com.orders.map.mapping.OrderMapping;
import com.orders.map.vo.OrderSummaryVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdersApplicationTests {

	@Autowired
	OrderMapping orderMapping;

	@Test
	public void contextLoads() {

	}

}
