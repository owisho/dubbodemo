package per.owisho.learn.dubboservicedemo.notify;

import per.owisho.learn.dubbointerdemo.NotifyService;

public class NotifyServiceImpl implements NotifyService{

	@Override
	public String get(Integer id) {
		return "·µ»Øid£º"+id;
	}

}
