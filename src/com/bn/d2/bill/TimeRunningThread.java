package com.bn.d2.bill;
/**
 * 
 *负责倒计时的线程
 *
 */
public class TimeRunningThread extends Thread {
	GameView gameView;
	private boolean flag=false;
	private boolean workflag=false;
	private int sleepSpan=1000;		
	public TimeRunningThread(GameView gameView)
	{
		this.gameView=gameView;
	}
	@Override
	public void run()
	{
		while(flag){
			 
		while(workflag)
		{			
			 try{
	            	Thread.sleep(sleepSpan);//睡眠指定毫秒数
	            }
	            catch(Exception e){
	            	e.printStackTrace();//打印堆栈信息
	            }
	            gameView.timer.subtractTime(1);
		}
		try{
        	Thread.sleep(sleepSpan);//睡眠指定毫秒数
        }
        catch(Exception e){
        	e.printStackTrace();//打印堆栈信息
        }
		}
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void setworkFlag(boolean workFlag) {
		this.workflag = workFlag;
	}
}
