package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

/**
 * SysRoleRightId generated by hbm2java
 */
public class SysRoleRightId implements java.io.Serializable
{

	private int roleId;
	private int menuId;

	public SysRoleRightId()
	{
	}

	public SysRoleRightId(int roleId, int menuId)
	{
		this.roleId = roleId;
		this.menuId = menuId;
	}

	public int getRoleId()
	{
		return this.roleId;
	}

	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	public int getMenuId()
	{
		return this.menuId;
	}

	public void setMenuId(int menuId)
	{
		this.menuId = menuId;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysRoleRightId))
			return false;
		SysRoleRightId castOther = (SysRoleRightId) other;

		return (this.getRoleId() == castOther.getRoleId()) && (this.getMenuId() == castOther.getMenuId());
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getRoleId();
		result = 37 * result + this.getMenuId();
		return result;
	}

}
