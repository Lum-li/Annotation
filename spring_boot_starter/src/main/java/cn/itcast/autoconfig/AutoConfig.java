package cn.itcast.autoconfig;

import cn.itcast.service.Mouse;
import org.springframework.context.annotation.Import;
import cn.itcast.service.ItCountService;

@Import({ItCountService.class, Mouse.class})
public class AutoConfig {
}
