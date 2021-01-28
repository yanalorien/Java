package pages;

public class TimezonePage
{
	private int day_of_week;
	private String utc_offset;
	private float raw_offset;
	private String timezone;
	private float unixtime;
	private String dst_from = null;
	private String datetime;
	private float week_number;
	private String utc_datetime;
	private boolean dst;
	private String abbreviation;
	private float day_of_year;
	private float dst_offset;
	private String dst_until = null;
	private String client_ip;
	// Getter Methods 

	public float getDay_of_week()
	{
		return day_of_week;
	}

	public String getUtc_offset()
	{
		return utc_offset;
	}

	public float getRaw_offset()
	{
		return raw_offset;
	}

	public String getTimezone()
	{
		return timezone;
	}

	public float getUnixtime()
	{
		return unixtime;
	}

	public String getDst_from()
	{
		return dst_from;
	}

	public String getDatetime()
	{
		return datetime;
	}

	public float getWeek_number()
	{
		return week_number;
	}

	public String getUtc_datetime()
	{
		return utc_datetime;
	}

	public boolean getDst()
	{
		return dst;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public float getDay_of_year()
	{
		return day_of_year;
	}

	public float getDst_offset()
	{
		return dst_offset;
	}

	public String getDst_until()
	{
		return dst_until;
	}

	public String getClient_ip()
	{
		return client_ip;
	}
	// Setter Methods 

	public void setDay_of_week(int day_of_week)
	{
		this.day_of_week = day_of_week;
	}

	public void setUtc_offset(String utc_offset)
	{
		this.utc_offset = utc_offset;
	}

	public void setRaw_offset(float raw_offset)
	{
		this.raw_offset = raw_offset;
	}

	public void setTimezone(String timezone)
	{
		this.timezone = timezone;
	}

	public void setUnixtime(float unixtime)
	{
		this.unixtime = unixtime;
	}

	public void setDst_from(String dst_from)
	{
		this.dst_from = dst_from;
	}

	public void setDatetime(String datetime)
	{
		this.datetime = datetime;
	}

	public void setWeek_number(float week_number)
	{
		this.week_number = week_number;
	}

	public void setUtc_datetime(String utc_datetime)
	{
		this.utc_datetime = utc_datetime;
	}

	public void setDst(boolean dst)
	{
		this.dst = dst;
	}

	public void setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public void setDay_of_year(float day_of_year)
	{
		this.day_of_year = day_of_year;
	}

	public void setDst_offset(float dst_offset)
	{
		this.dst_offset = dst_offset;
	}

	public void setDst_until(String dst_until)
	{
		this.dst_until = dst_until;
	}

	public void setClient_ip(String client_ip)
	{
		this.client_ip = client_ip;
	}
}
