package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.sql.Clob;
import java.util.Date;

/**
 * HlaCool generated by hbm2java
 */
public class HlaCool implements java.io.Serializable
{

	private int id;
	private Date operDate;
	private int nums;
	private char operType;
	private Character rcsId;
	private String boardNo;
	private String operName;
	private String checkName;
	private Date checkDate;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Clob dongcunbiaobenleixing;
	private Clob dongcunbiaobenfenlei;

	public HlaCool()
	{
	}

	public HlaCool(int id, Date operDate, int nums, char operType, String boardNo, String operName)
	{
		this.id = id;
		this.operDate = operDate;
		this.nums = nums;
		this.operType = operType;
		this.boardNo = boardNo;
		this.operName = operName;
	}

	public HlaCool(int id, Date operDate, int nums, char operType, Character rcsId, String boardNo, String operName,
			String checkName, Date checkDate, String remark, Date recordTime, String recordName,
			Clob dongcunbiaobenleixing, Clob dongcunbiaobenfenlei)
	{
		this.id = id;
		this.operDate = operDate;
		this.nums = nums;
		this.operType = operType;
		this.rcsId = rcsId;
		this.boardNo = boardNo;
		this.operName = operName;
		this.checkName = checkName;
		this.checkDate = checkDate;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.dongcunbiaobenleixing = dongcunbiaobenleixing;
		this.dongcunbiaobenfenlei = dongcunbiaobenfenlei;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getOperDate()
	{
		return this.operDate;
	}

	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}

	public int getNums()
	{
		return this.nums;
	}

	public void setNums(int nums)
	{
		this.nums = nums;
	}

	public char getOperType()
	{
		return this.operType;
	}

	public void setOperType(char operType)
	{
		this.operType = operType;
	}

	public Character getRcsId()
	{
		return this.rcsId;
	}

	public void setRcsId(Character rcsId)
	{
		this.rcsId = rcsId;
	}

	public String getBoardNo()
	{
		return this.boardNo;
	}

	public void setBoardNo(String boardNo)
	{
		this.boardNo = boardNo;
	}

	public String getOperName()
	{
		return this.operName;
	}

	public void setOperName(String operName)
	{
		this.operName = operName;
	}

	public String getCheckName()
	{
		return this.checkName;
	}

	public void setCheckName(String checkName)
	{
		this.checkName = checkName;
	}

	public Date getCheckDate()
	{
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate)
	{
		this.checkDate = checkDate;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public Clob getDongcunbiaobenleixing()
	{
		return this.dongcunbiaobenleixing;
	}

	public void setDongcunbiaobenleixing(Clob dongcunbiaobenleixing)
	{
		this.dongcunbiaobenleixing = dongcunbiaobenleixing;
	}

	public Clob getDongcunbiaobenfenlei()
	{
		return this.dongcunbiaobenfenlei;
	}

	public void setDongcunbiaobenfenlei(Clob dongcunbiaobenfenlei)
	{
		this.dongcunbiaobenfenlei = dongcunbiaobenfenlei;
	}

}