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
 * Home object for domain model class LiquidSterilize.
 * @see deefw.LiquidSterilize
 * @author Hibernate Tools
 */
public class LiquidSterilizeHome
{

	private static final Log log = LogFactory.getLog(LiquidSterilizeHome.class);

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

	public void persist(LiquidSterilize transientInstance)
	{
		log.debug("persisting LiquidSterilize instance");
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

	public void attachDirty(LiquidSterilize instance)
	{
		log.debug("attaching dirty LiquidSterilize instance");
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

	public void attachClean(LiquidSterilize instance)
	{
		log.debug("attaching clean LiquidSterilize instance");
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

	public void delete(LiquidSterilize persistentInstance)
	{
		log.debug("deleting LiquidSterilize instance");
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

	public LiquidSterilize merge(LiquidSterilize detachedInstance)
	{
		log.debug("merging LiquidSterilize instance");
		try
		{
			LiquidSterilize result = (LiquidSterilize) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public LiquidSterilize findById(int id)
	{
		log.debug("getting LiquidSterilize instance with id: " + id);
		try
		{
			LiquidSterilize instance = (LiquidSterilize) sessionFactory.getCurrentSession().get("deefw.LiquidSterilize",
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

	public List<LiquidSterilize> findByExample(LiquidSterilize instance)
	{
		log.debug("finding LiquidSterilize instance by example");
		try
		{
			List<LiquidSterilize> results = (List<LiquidSterilize>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.LiquidSterilize").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
