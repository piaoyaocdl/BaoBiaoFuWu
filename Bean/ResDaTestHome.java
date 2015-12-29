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
 * Home object for domain model class ResDaTest.
 * @see deefw.ResDaTest
 * @author Hibernate Tools
 */
public class ResDaTestHome
{

	private static final Log log = LogFactory.getLog(ResDaTestHome.class);

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

	public void persist(ResDaTest transientInstance)
	{
		log.debug("persisting ResDaTest instance");
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

	public void attachDirty(ResDaTest instance)
	{
		log.debug("attaching dirty ResDaTest instance");
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

	public void attachClean(ResDaTest instance)
	{
		log.debug("attaching clean ResDaTest instance");
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

	public void delete(ResDaTest persistentInstance)
	{
		log.debug("deleting ResDaTest instance");
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

	public ResDaTest merge(ResDaTest detachedInstance)
	{
		log.debug("merging ResDaTest instance");
		try
		{
			ResDaTest result = (ResDaTest) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResDaTest findById(int id)
	{
		log.debug("getting ResDaTest instance with id: " + id);
		try
		{
			ResDaTest instance = (ResDaTest) sessionFactory.getCurrentSession().get("deefw.ResDaTest", id);
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

	public List<ResDaTest> findByExample(ResDaTest instance)
	{
		log.debug("finding ResDaTest instance by example");
		try
		{
			List<ResDaTest> results = (List<ResDaTest>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResDaTest").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
