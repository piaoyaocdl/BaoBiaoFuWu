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
 * Home object for domain model class ResCrossMatch.
 * @see deefw.ResCrossMatch
 * @author Hibernate Tools
 */
public class ResCrossMatchHome
{

	private static final Log log = LogFactory.getLog(ResCrossMatchHome.class);

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

	public void persist(ResCrossMatch transientInstance)
	{
		log.debug("persisting ResCrossMatch instance");
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

	public void attachDirty(ResCrossMatch instance)
	{
		log.debug("attaching dirty ResCrossMatch instance");
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

	public void attachClean(ResCrossMatch instance)
	{
		log.debug("attaching clean ResCrossMatch instance");
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

	public void delete(ResCrossMatch persistentInstance)
	{
		log.debug("deleting ResCrossMatch instance");
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

	public ResCrossMatch merge(ResCrossMatch detachedInstance)
	{
		log.debug("merging ResCrossMatch instance");
		try
		{
			ResCrossMatch result = (ResCrossMatch) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResCrossMatch findById(int id)
	{
		log.debug("getting ResCrossMatch instance with id: " + id);
		try
		{
			ResCrossMatch instance = (ResCrossMatch) sessionFactory.getCurrentSession().get("deefw.ResCrossMatch", id);
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

	public List<ResCrossMatch> findByExample(ResCrossMatch instance)
	{
		log.debug("finding ResCrossMatch instance by example");
		try
		{
			List<ResCrossMatch> results = (List<ResCrossMatch>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResCrossMatch").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
