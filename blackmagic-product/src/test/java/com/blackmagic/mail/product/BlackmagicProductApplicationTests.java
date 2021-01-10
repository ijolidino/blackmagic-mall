package com.blackmagic.mail.product;

import com.blackmagic.mall.product.entity.BrandEntity;
import com.blackmagic.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@Slf4j
@RunWith(SpringRunner.class)
class BlackmagicProductApplicationTests {
@Autowired
private BrandService brandService;
@Autowired
private BrandEntity brandEntity;
	@Test
	void contextLoads() {
//
//		brandEntity.setBrandId(198L);
//		brandEntity.setSort(1);
//		brandEntity.setDescript("ninhao");
//		brandEntity.setName("ninhao");
//		brandEntity.setLogo("https://blackmagicmall-hello.oss-cn-beijing.aliyuncs.com/2019-11-18/819bb0b1-3ed8-4072-8304-78811a289781_apple.png");
//		brandEntity.setShowStatus(1);
//		brandEntity.setFirstLetter("A");
//		brandService.save(brandEntity);
//		System.out.println("success");
	}

}
