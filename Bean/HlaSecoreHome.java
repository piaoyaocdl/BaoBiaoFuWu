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
 * Home object for domain model class HlaSecore.
 * @see deefw.HlaSecore
 * @author Hibernate Tools
 */
public class HlaSecoreHome
{

	private static final Log log = LogFactory.getLog(HlaSecoreHome.class);

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

	public void persist(HlaSecore transientInstance)
	{
		log.debug("persisting HlaSecore instance");
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

	public void attachDirty(HlaSecore instance)
	{
		log.debug("attaching dirty HlaSecore instance");
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

	public void attachClean(HlaSecore instance)
	{
		log.debug("attaching clean HlaSecore instance");
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

	public void delete(HlaSecore persistentInstance)
	{
		log.debug("deleting HlaSecore instance");
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

	public HlaSecore merge(HlaSecore detachedInstance)
	{
		log.debug("merging HlaSecore instance");
		try
		{
			HlaSecore result = (HlaSecore) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaSecore findById(int id)
	{
		log.debug("getting HlaSecore instance with id: " + id);
		try
		{
			HlaSecore instance = (HlaSecore) sessionFactory.getCurrentSession().get("deefw.HlaSecore", id);
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

	public List<HlaSecore> findByExample(HlaSecore instance)
	{
		log.debug("finding HlaSecore instance by example");
		try
		{
			List<HlaSecore> results = (List<HlaSecore>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.HlaSecore").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
