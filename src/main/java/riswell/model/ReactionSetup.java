package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ReactionSetup generated by hbm2java
 */
public class ReactionSetup implements java.io.Serializable
{

	private int id;
	private String code;
	private String name;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Set<ReactionSetupItem> reactionSetupItems = new HashSet<ReactionSetupItem>(0);

	public ReactionSetup()
	{
	}

	public ReactionSetup(int id, String code)
	{
		this.id = id;
		this.code = code;
	}

	public ReactionSetup(int id, String code, String name, String remark, String recordName, Date recordTime,
			Set<ReactionSetupItem> reactionSetupItems)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.reactionSetupItems = reactionSetupItems;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

	public Set<ReactionSetupItem> getReactionSetupItems()
	{
		return this.reactionSetupItems;
	}

	public void setReactionSetupItems(Set<ReactionSetupItem> reactionSetupItems)
	{
		this.reactionSetupItems = reactionSetupItems;
	}

}
