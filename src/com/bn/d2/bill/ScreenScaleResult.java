package com.bn.d2.bill;

/**
 * 屏幕结果，确定如何缩放和是否布满整个屏幕
 * @author Administrator
 *
 */
enum ScreenOrien
{
	HP,  //表示横屏的枚举值
	SP   //表示竖屏的枚举值
}

//缩放计算的结果
public class ScreenScaleResult
{
	int lucX;//左上角X坐标
	int lucY;//左上角y坐标
	float ratio;//缩放比例
	ScreenOrien so;//横竖屏情况	
	
	public ScreenScaleResult(int lucX,int lucY,float ratio,ScreenOrien so)
	{
		this.lucX=lucX;
		this.lucY=lucY;
		this.ratio=ratio;
		this.so=so;
	}
	
	public String toString()
	{
		return "lucX="+lucX+", lucY="+lucY+", ratio="+ratio+", "+so;
	}
}