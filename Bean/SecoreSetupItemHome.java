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
 * Home object for domain model class SecoreSetupItem.
 * @see deefw.SecoreSetupItem
 * @author Hibernate Tools
 */
public class SecoreSetupItemHome
{

	private static final Log log = LogFactory.getLog(SecoreSetupItemHome.class);

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

	public void persist(SecoreSetupItem transientInstance)
	{
		log.debug("persisting SecoreSetupItem instance");
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

	public void attachDirty(SecoreSetupItem instance)
	{
		log.debug("attaching dirty SecoreSetupItem instance");
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

	public void attachClean(SecoreSetupItem instance)
	{
		log.debug("attaching clean SecoreSetupItem instance");
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

	public void delete(SecoreSetupItem persistentInstance)
	{
		log.debug("deleting SecoreSetupItem instance");
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

	public SecoreSetupItem merge(SecoreSetupItem detachedInstance)
	{
		log.debug("merging SecoreSetupItem instance");
		try
		{
			SecoreSetupItem result = (SecoreSetupItem) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public SecoreSetupItem findById(int id)
	{
		log.debug("getting SecoreSetupItem instance with id: " + id);
		try
		{
			SecoreSetupItem instance = (SecoreSetupItem) sessionFactory.getCurrentSession().get("deefw.SecoreSetupItem",
					id);
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

	public List<SecoreSetupItem> findByExample(SecoreSetupItem instance)
	{
		log.debug("finding SecoreSetupItem instance by example");
		try
		{
			List<SecoreSetupItem> results = (List<SecoreSetupItem>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.SecoreSetupItem").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
