package com.bn.d2.bill;
/**
 * 
 *���𵹼�ʱ���߳�
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
	            	Thread.sleep(sleepSpan);//˯��ָ��������
	            }
	            catch(Exception e){
	            	e.printStackTrace();//��ӡ��ջ��Ϣ
	            }
	            gameView.timer.subtractTime(1);
		}
		try{
        	Thread.sleep(sleepSpan);//˯��ָ��������
        }
        catch(Exception e){
        	e.printStackTrace();//��ӡ��ջ��Ϣ
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
