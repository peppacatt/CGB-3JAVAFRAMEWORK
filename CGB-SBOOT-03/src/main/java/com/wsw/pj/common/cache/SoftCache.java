package com.wsw.pj.common.cache;

import org.springframework.stereotype.Component;

@Component   //假如省略名字，则bean的名字默认为类名，然后首字母小写
//@Component("soft")
public class SoftCache implements Cache {

}
