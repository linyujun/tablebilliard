package com.bn.d2.bill;
import android.view.SurfaceHolder;

public class GameViewDrawThread extends Thread{
	private boolean flag = false;	
	private boolean workflag=false;
	private int sleepSpan = 10;
	GameView gameView;
	SurfaceHolder surfaceHolder;
	public GameViewDrawThread(GameView gameView){
		this.gameView = gameView;
		this.surfaceHolder = gameView.getHolder();
	}
	public void run(){	
		
		while(flag){
			
        while (workflag) {
            gameView.repaint();
            try{
            	Thread.sleep(sleepSpan);//˯��ָ��������
            }
            catch(Exception e){
            	e.printStackTrace();//��ӡ��ջ��Ϣ
            }
        }
        try{
        	Thread.sleep(1000);//˯��ָ��������
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
