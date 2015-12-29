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
 * Home object for domain model class RcsSampleInfo.
 * @see deefw.RcsSampleInfo
 * @author Hibernate Tools
 */
public class RcsSampleInfoHome
{

	private static final Log log = LogFactory.getLog(RcsSampleInfoHome.class);

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

	public void persist(RcsSampleInfo transientInstance)
	{
		log.debug("persisting RcsSampleInfo instance");
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

	public void attachDirty(RcsSampleInfo instance)
	{
		log.debug("attaching dirty RcsSampleInfo instance");
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

	public void attachClean(RcsSampleInfo instance)
	{
		log.debug("attaching clean RcsSampleInfo instance");
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

	public void delete(RcsSampleInfo persistentInstance)
	{
		log.debug("deleting RcsSampleInfo instance");
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

	public RcsSampleInfo merge(RcsSampleInfo detachedInstance)
	{
		log.debug("merging RcsSampleInfo instance");
		try
		{
			RcsSampleInfo result = (RcsSampleInfo) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public RcsSampleInfo findById(int id)
	{
		log.debug("getting RcsSampleInfo instance with id: " + id);
		try
		{
			RcsSampleInfo instance = (RcsSampleInfo) sessionFactory.getCurrentSession().get("deefw.RcsSampleInfo", id);
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

	public List<RcsSampleInfo> findByExample(RcsSampleInfo instance)
	{
		log.debug("finding RcsSampleInfo instance by example");
		try
		{
			List<RcsSampleInfo> results = (List<RcsSampleInfo>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.RcsSampleInfo").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
