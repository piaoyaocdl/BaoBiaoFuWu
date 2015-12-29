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
 * Home object for domain model class ResRaTest.
 * @see deefw.ResRaTest
 * @author Hibernate Tools
 */
public class ResRaTestHome
{

	private static final Log log = LogFactory.getLog(ResRaTestHome.class);

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

	public void persist(ResRaTest transientInstance)
	{
		log.debug("persisting ResRaTest instance");
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

	public void attachDirty(ResRaTest instance)
	{
		log.debug("attaching dirty ResRaTest instance");
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

	public void attachClean(ResRaTest instance)
	{
		log.debug("attaching clean ResRaTest instance");
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

	public void delete(ResRaTest persistentInstance)
	{
		log.debug("deleting ResRaTest instance");
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

	public ResRaTest merge(ResRaTest detachedInstance)
	{
		log.debug("merging ResRaTest instance");
		try
		{
			ResRaTest result = (ResRaTest) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResRaTest findById(int id)
	{
		log.debug("getting ResRaTest instance with id: " + id);
		try
		{
			ResRaTest instance = (ResRaTest) sessionFactory.getCurrentSession().get("deefw.ResRaTest", id);
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

	public List<ResRaTest> findByExample(ResRaTest instance)
	{
		log.debug("finding ResRaTest instance by example");
		try
		{
			List<ResRaTest> results = (List<ResRaTest>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResRaTest").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
