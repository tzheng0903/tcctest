package cn.evun.lcntest.t1;

import cn.evun.lcntest.t1.service.MyService;
import cn.evun.lcntest.t1.service.impl.MyServiceImpl;

public class Main {

	public static void main(String[] args) {
		MyService service  = new MyServiceImpl();
		service.test();
	}

}
