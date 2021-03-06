package ex54;
import java.awt.*;
import java.applet.*;
import java.util.*;

public class DigitalClock extends Applet implements Runnable
{
	protected Thread clockThread = null;
	protected Font font = null;
	protected Color color = null;
	protected Font dateFont = null;
	protected Color borderColor = null;

	String[] monthName = {"Jan", "Feb",
			"Mar", "Apr", "May", "Jun", "Jul",
			"Aug", "Sep", "Oct", "Nov",
			"Dec"};

	String[] dayName = {"Sun", "Mon", "Tue",
			"Wed", "Thu", "Fri", "Sat"};
	
	public void init()
	{	
		int fontSize = 20;
		try{
			fontSize = Integer.parseInt(getParameter("SIZE"));
		}catch(Exception ex){}
		String fontName = getParameter("FONT");
		font = new Font(fontName, Font.BOLD, fontSize);
		color = getColor("COLOR");
		dateFont = new Font(fontName, Font.BOLD, (int)(fontSize*0.7) );
		borderColor = getColor("BORDER_COLOR");
	}
	public void start()
	{
		if(clockThread == null){
			clockThread = new Thread(this);
			clockThread.start();
		}
	}
	
	public void stop()
	{
		clockThread = null;
	}
	
	public void run(){
		while(Thread.currentThread() == clockThread){			
			repaint();			
			try{
				Thread.currentThread();
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	public void paint(Graphics g){
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR );
		int amPm = calendar.get(Calendar.AM_PM);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String amPmStr = (amPm == Calendar.AM) ? "AM" : "PM";
		
		g.setColor(borderColor);
		g.draw3DRect(2, 10, 240, 50, true);
		g.setFont(font);
		g.setColor(color);

		String s = String.format("%s:%02d:%02d%s", hour, minute, second, amPmStr);
		g.drawString(s, 10, 50);
		
		g.setColor(borderColor);
		g.draw3DRect(2, 65, 240, 30, true);
		g.setFont(dateFont);
		g.setColor(color);
		s = String.format("%s %s %s %s", day, monthName[month], year, dayName[dayOfWeek-1]);
		g.drawString(s , 10, 90);
	}
			
	private Color getColor(String colorOf){
		String color = getParameter(colorOf);
		if(!color.isEmpty()){
			String[] rgb = color.split(",");	
			int r = getColorComponent(rgb[0]);
			int g = getColorComponent(rgb[1]);
			int b = getColorComponent(rgb[2]);
			return new Color(r, g, b);
		}else{
			return Color.BLACK;
		}		
	}
	
	private int getColorComponent(String componentStr){
		try{
			return Integer.parseInt(componentStr);
		}catch(Exception ex){
			return 1;
		}
	}
}
