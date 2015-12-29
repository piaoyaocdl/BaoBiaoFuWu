package deefw;
// Generated 2015-12-29 13:42:13 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SysRoleRight.
 * @see deefw.SysRoleRight
 * @author Hibernate Tools
 */
public class SysRoleRightHome
{

	private static final Log log = LogFactory.getLog(SysRoleRightHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory()
	{
		try
		{
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e)
		{
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SysRoleRight transientInstance)
	{
		log.debug("persisting SysRoleRight instance");
		try
		{
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SysRoleRight instance)
	{
		log.debug("attaching dirty SysRoleRight instance");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SysRoleRight instance)
	{
		log.debug("attaching clean SysRoleRight instance");
		try
		{
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SysRoleRight persistentInstance)
	{
		log.debug("deleting SysRoleRight instance");
		try
		{
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public SysRoleRight merge(SysRoleRight detachedInstance)
	{
		log.debug("merging SysRoleRight instance");
		try
		{
			SysRoleRight result = (SysRoleRight) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public SysRoleRight findById(deefw.SysRoleRightId id)
	{
		log.debug("getting SysRoleRight instance with id: " + id);
		try
		{
			SysRoleRight instance = (SysRoleRight) sessionFactory.getCurrentSession().get("deefw.SysRoleRight", id);
			if (instance == null)
			{
				log.debug("get successful, no instance found");
			} else
			{
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List<SysRoleRight> findByExample(SysRoleRight instance)
	{
		log.debug("finding SysRoleRight instance by example");
		try
		{
			List<SysRoleRight> results = (List<SysRoleRight>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.SysRoleRight").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
