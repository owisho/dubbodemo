package per.owisho.learn.dubboclientdemo;

import java.util.HashMap;
import java.util.Map;

import per.owisho.learn.dubboclientdemo.inter.Notify;

public class NotifyImpl implements Notify{

	public Map<Integer,String> ret = new HashMap<Integer,String>();
	
	public Map<Integer,Throwable> errors = new HashMap<Integer,Throwable>();
	
	@Override
	public void onreturn(String msg, Integer id) {
		System.out.println("onreturn:"+msg);
		ret.put(id, msg);
	}

	@Override
	public void onthrow(Throwable ex, Integer id) {
		errors.put(id, ex);
	}

}
