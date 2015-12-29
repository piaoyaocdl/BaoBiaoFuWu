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
 * Home object for domain model class ReagentBatch.
 * @see deefw.ReagentBatch
 * @author Hibernate Tools
 */
public class ReagentBatchHome
{

	private static final Log log = LogFactory.getLog(ReagentBatchHome.class);

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

	public void persist(ReagentBatch transientInstance)
	{
		log.debug("persisting ReagentBatch instance");
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

	public void attachDirty(ReagentBatch instance)
	{
		log.debug("attaching dirty ReagentBatch instance");
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

	public void attachClean(ReagentBatch instance)
	{
		log.debug("attaching clean ReagentBatch instance");
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

	public void delete(ReagentBatch persistentInstance)
	{
		log.debug("deleting ReagentBatch instance");
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

	public ReagentBatch merge(ReagentBatch detachedInstance)
	{
		log.debug("merging ReagentBatch instance");
		try
		{
			ReagentBatch result = (ReagentBatch) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReagentBatch findById(int id)
	{
		log.debug("getting ReagentBatch instance with id: " + id);
		try
		{
			ReagentBatch instance = (ReagentBatch) sessionFactory.getCurrentSession().get("deefw.ReagentBatch", id);
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

	public List<ReagentBatch> findByExample(ReagentBatch instance)
	{
		log.debug("finding ReagentBatch instance by example");
		try
		{
			List<ReagentBatch> results = (List<ReagentBatch>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReagentBatch").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
