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
 * Home object for domain model class ResSerumTest.
 * @see deefw.ResSerumTest
 * @author Hibernate Tools
 */
public class ResSerumTestHome
{

	private static final Log log = LogFactory.getLog(ResSerumTestHome.class);

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

	public void persist(ResSerumTest transientInstance)
	{
		log.debug("persisting ResSerumTest instance");
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

	public void attachDirty(ResSerumTest instance)
	{
		log.debug("attaching dirty ResSerumTest instance");
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

	public void attachClean(ResSerumTest instance)
	{
		log.debug("attaching clean ResSerumTest instance");
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

	public void delete(ResSerumTest persistentInstance)
	{
		log.debug("deleting ResSerumTest instance");
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

	public ResSerumTest merge(ResSerumTest detachedInstance)
	{
		log.debug("merging ResSerumTest instance");
		try
		{
			ResSerumTest result = (ResSerumTest) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResSerumTest findById(int id)
	{
		log.debug("getting ResSerumTest instance with id: " + id);
		try
		{
			ResSerumTest instance = (ResSerumTest) sessionFactory.getCurrentSession().get("deefw.ResSerumTest", id);
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

	public List<ResSerumTest> findByExample(ResSerumTest instance)
	{
		log.debug("finding ResSerumTest instance by example");
		try
		{
			List<ResSerumTest> results = (List<ResSerumTest>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResSerumTest").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
