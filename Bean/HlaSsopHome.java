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
 * Home object for domain model class HlaSsop.
 * @see deefw.HlaSsop
 * @author Hibernate Tools
 */
public class HlaSsopHome
{

	private static final Log log = LogFactory.getLog(HlaSsopHome.class);

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

	public void persist(HlaSsop transientInstance)
	{
		log.debug("persisting HlaSsop instance");
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

	public void attachDirty(HlaSsop instance)
	{
		log.debug("attaching dirty HlaSsop instance");
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

	public void attachClean(HlaSsop instance)
	{
		log.debug("attaching clean HlaSsop instance");
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

	public void delete(HlaSsop persistentInstance)
	{
		log.debug("deleting HlaSsop instance");
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

	public HlaSsop merge(HlaSsop detachedInstance)
	{
		log.debug("merging HlaSsop instance");
		try
		{
			HlaSsop result = (HlaSsop) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaSsop findById(deefw.HlaSsopId id)
	{
		log.debug("getting HlaSsop instance with id: " + id);
		try
		{
			HlaSsop instance = (HlaSsop) sessionFactory.getCurrentSession().get("deefw.HlaSsop", id);
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

	public List<HlaSsop> findByExample(HlaSsop instance)
	{
		log.debug("finding HlaSsop instance by example");
		try
		{
			List<HlaSsop> results = (List<HlaSsop>) sessionFactory.getCurrentSession().createCriteria("deefw.HlaSsop")
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
