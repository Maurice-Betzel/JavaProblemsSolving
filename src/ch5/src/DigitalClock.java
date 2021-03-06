import java.awt.*;
import java.applet.*;
import java.util.*;

public class DigitalClock extends Applet implements Runnable
{
	protected Thread clockThread = null;
	protected Font font = new Font("Monospaced", Font.BOLD, 40);
	protected Color color = Color.BLACK;
	protected Font dateFont = new Font("Monospaced", Font.BOLD, 25);

	String[] monthName = {"Jan", "Feb",
			"Mar", "Apr", "May", "Jun", "Jul",
			"Aug", "Sep", "Oct", "Nov",
			"Dec"};

	String[] dayName = {"Sun", "Mon", "Tue",
			"Wed", "Thu", "Fri", "Sat"};
	
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
		
		g.draw3DRect(2, 10, 260, 50, true);
		g.setFont(font);
		g.setColor(color);
		g.drawString(hour + ":" + minute + ":" + second + amPmStr, 10, 50);
		
		g.setColor(Color.BLACK);
		g.draw3DRect(2, 65, 260, 50, true);
		g.setFont(dateFont);
		g.setColor(color);
		g.drawString(day + " " + monthName[month-1] + " " + year + " " + dayName[dayOfWeek-1] , 10, 110);

	}
}
