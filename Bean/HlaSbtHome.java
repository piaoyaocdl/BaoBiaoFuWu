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
 * Home object for domain model class HlaSbt.
 * @see deefw.HlaSbt
 * @author Hibernate Tools
 */
public class HlaSbtHome
{

	private static final Log log = LogFactory.getLog(HlaSbtHome.class);

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

	public void persist(HlaSbt transientInstance)
	{
		log.debug("persisting HlaSbt instance");
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

	public void attachDirty(HlaSbt instance)
	{
		log.debug("attaching dirty HlaSbt instance");
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

	public void attachClean(HlaSbt instance)
	{
		log.debug("attaching clean HlaSbt instance");
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

	public void delete(HlaSbt persistentInstance)
	{
		log.debug("deleting HlaSbt instance");
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

	public HlaSbt merge(HlaSbt detachedInstance)
	{
		log.debug("merging HlaSbt instance");
		try
		{
			HlaSbt result = (HlaSbt) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaSbt findById(deefw.HlaSbtId id)
	{
		log.debug("getting HlaSbt instance with id: " + id);
		try
		{
			HlaSbt instance = (HlaSbt) sessionFactory.getCurrentSession().get("deefw.HlaSbt", id);
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

	public List<HlaSbt> findByExample(HlaSbt instance)
	{
		log.debug("finding HlaSbt instance by example");
		try
		{
			List<HlaSbt> results = (List<HlaSbt>) sessionFactory.getCurrentSession().createCriteria("deefw.HlaSbt")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
