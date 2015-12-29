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
 * Home object for domain model class HlaSgResult.
 * @see deefw.HlaSgResult
 * @author Hibernate Tools
 */
public class HlaSgResultHome
{

	private static final Log log = LogFactory.getLog(HlaSgResultHome.class);

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

	public void persist(HlaSgResult transientInstance)
	{
		log.debug("persisting HlaSgResult instance");
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

	public void attachDirty(HlaSgResult instance)
	{
		log.debug("attaching dirty HlaSgResult instance");
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

	public void attachClean(HlaSgResult instance)
	{
		log.debug("attaching clean HlaSgResult instance");
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

	public void delete(HlaSgResult persistentInstance)
	{
		log.debug("deleting HlaSgResult instance");
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

	public HlaSgResult merge(HlaSgResult detachedInstance)
	{
		log.debug("merging HlaSgResult instance");
		try
		{
			HlaSgResult result = (HlaSgResult) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaSgResult findById(int id)
	{
		log.debug("getting HlaSgResult instance with id: " + id);
		try
		{
			HlaSgResult instance = (HlaSgResult) sessionFactory.getCurrentSession().get("deefw.HlaSgResult", id);
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

	public List<HlaSgResult> findByExample(HlaSgResult instance)
	{
		log.debug("finding HlaSgResult instance by example");
		try
		{
			List<HlaSgResult> results = (List<HlaSgResult>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.HlaSgResult").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
