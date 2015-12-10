package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * SysRoleRight generated by hbm2java
 */
public class SysRoleRight implements java.io.Serializable
{

	private SysRoleRightId id;
	private SysMenu sysMenu;
	private SysRole sysRole;
	private String recordName;
	private Date recordTime;

	public SysRoleRight()
	{
	}

	public SysRoleRight(SysRoleRightId id, SysMenu sysMenu, SysRole sysRole)
	{
		this.id = id;
		this.sysMenu = sysMenu;
		this.sysRole = sysRole;
	}

	public SysRoleRight(SysRoleRightId id, SysMenu sysMenu, SysRole sysRole, String recordName, Date recordTime)
	{
		this.id = id;
		this.sysMenu = sysMenu;
		this.sysRole = sysRole;
		this.recordName = recordName;
		this.recordTime = recordTime;
	}

	public SysRoleRightId getId()
	{
		return this.id;
	}

	public void setId(SysRoleRightId id)
	{
		this.id = id;
	}

	public SysMenu getSysMenu()
	{
		return this.sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu)
	{
		this.sysMenu = sysMenu;
	}

	public SysRole getSysRole()
	{
		return this.sysRole;
	}

	public void setSysRole(SysRole sysRole)
	{
		this.sysRole = sysRole;
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

}