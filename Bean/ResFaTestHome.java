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
 * Home object for domain model class ResFaTest.
 * @see deefw.ResFaTest
 * @author Hibernate Tools
 */
public class ResFaTestHome
{

	private static final Log log = LogFactory.getLog(ResFaTestHome.class);

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

	public void persist(ResFaTest transientInstance)
	{
		log.debug("persisting ResFaTest instance");
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

	public void attachDirty(ResFaTest instance)
	{
		log.debug("attaching dirty ResFaTest instance");
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

	public void attachClean(ResFaTest instance)
	{
		log.debug("attaching clean ResFaTest instance");
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

	public void delete(ResFaTest persistentInstance)
	{
		log.debug("deleting ResFaTest instance");
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

	public ResFaTest merge(ResFaTest detachedInstance)
	{
		log.debug("merging ResFaTest instance");
		try
		{
			ResFaTest result = (ResFaTest) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResFaTest findById(int id)
	{
		log.debug("getting ResFaTest instance with id: " + id);
		try
		{
			ResFaTest instance = (ResFaTest) sessionFactory.getCurrentSession().get("deefw.ResFaTest", id);
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

	public List<ResFaTest> findByExample(ResFaTest instance)
	{
		log.debug("finding ResFaTest instance by example");
		try
		{
			List<ResFaTest> results = (List<ResFaTest>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResFaTest").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
