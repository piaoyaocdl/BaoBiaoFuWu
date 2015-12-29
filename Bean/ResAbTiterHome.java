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
 * Home object for domain model class ResAbTiter.
 * @see deefw.ResAbTiter
 * @author Hibernate Tools
 */
public class ResAbTiterHome
{

	private static final Log log = LogFactory.getLog(ResAbTiterHome.class);

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

	public void persist(ResAbTiter transientInstance)
	{
		log.debug("persisting ResAbTiter instance");
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

	public void attachDirty(ResAbTiter instance)
	{
		log.debug("attaching dirty ResAbTiter instance");
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

	public void attachClean(ResAbTiter instance)
	{
		log.debug("attaching clean ResAbTiter instance");
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

	public void delete(ResAbTiter persistentInstance)
	{
		log.debug("deleting ResAbTiter instance");
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

	public ResAbTiter merge(ResAbTiter detachedInstance)
	{
		log.debug("merging ResAbTiter instance");
		try
		{
			ResAbTiter result = (ResAbTiter) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResAbTiter findById(int id)
	{
		log.debug("getting ResAbTiter instance with id: " + id);
		try
		{
			ResAbTiter instance = (ResAbTiter) sessionFactory.getCurrentSession().get("deefw.ResAbTiter", id);
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

	public List<ResAbTiter> findByExample(ResAbTiter instance)
	{
		log.debug("finding ResAbTiter instance by example");
		try
		{
			List<ResAbTiter> results = (List<ResAbTiter>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResAbTiter").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
