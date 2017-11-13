package per.owisho.learn.dubboservicedemo.callback;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import per.owisho.learn.dubbointerdemo.CallbackListener;
import per.owisho.learn.dubbointerdemo.CallbackService;

public class CallbackServiceImpl implements CallbackService{

	private final Map<String,CallbackListener> listeners = new HashMap<String,CallbackListener>();
	
	public CallbackServiceImpl() {
		Thread t = new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						for(Entry<String, CallbackListener> entry:listeners.entrySet()){
							try {
								entry.getValue().changed(getChanged(entry.getKey()));
							} catch (Exception e) {
								listeners.remove(entry.getKey());
							}
						}
						Thread.sleep(5000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.setDaemon(true);
		t.start();
	}
	
	@Override
	public void addListener(String key, CallbackListener listener) {

		listeners.put(key, listener);
		listener.changed(getChanged(key));
	
	}

	private String getChanged(String key) {
		return "Changed: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
}
