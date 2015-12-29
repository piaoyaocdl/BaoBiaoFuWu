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
 * Home object for domain model class ReagentPrepare.
 * @see deefw.ReagentPrepare
 * @author Hibernate Tools
 */
public class ReagentPrepareHome
{

	private static final Log log = LogFactory.getLog(ReagentPrepareHome.class);

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

	public void persist(ReagentPrepare transientInstance)
	{
		log.debug("persisting ReagentPrepare instance");
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

	public void attachDirty(ReagentPrepare instance)
	{
		log.debug("attaching dirty ReagentPrepare instance");
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

	public void attachClean(ReagentPrepare instance)
	{
		log.debug("attaching clean ReagentPrepare instance");
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

	public void delete(ReagentPrepare persistentInstance)
	{
		log.debug("deleting ReagentPrepare instance");
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

	public ReagentPrepare merge(ReagentPrepare detachedInstance)
	{
		log.debug("merging ReagentPrepare instance");
		try
		{
			ReagentPrepare result = (ReagentPrepare) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReagentPrepare findById(int id)
	{
		log.debug("getting ReagentPrepare instance with id: " + id);
		try
		{
			ReagentPrepare instance = (ReagentPrepare) sessionFactory.getCurrentSession().get("deefw.ReagentPrepare",
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

	public List<ReagentPrepare> findByExample(ReagentPrepare instance)
	{
		log.debug("finding ReagentPrepare instance by example");
		try
		{
			List<ReagentPrepare> results = (List<ReagentPrepare>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReagentPrepare").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
