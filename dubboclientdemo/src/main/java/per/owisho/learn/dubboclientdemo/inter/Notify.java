package per.owisho.learn.dubboclientdemo.inter;

public interface Notify {

	void onreturn(String msg,Integer id);
	
	void onthrow(Throwable ex,Integer id);
	
}
