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
 * Home object for domain model class ReagentIo.
 * @see deefw.ReagentIo
 * @author Hibernate Tools
 */
public class ReagentIoHome
{

	private static final Log log = LogFactory.getLog(ReagentIoHome.class);

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

	public void persist(ReagentIo transientInstance)
	{
		log.debug("persisting ReagentIo instance");
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

	public void attachDirty(ReagentIo instance)
	{
		log.debug("attaching dirty ReagentIo instance");
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

	public void attachClean(ReagentIo instance)
	{
		log.debug("attaching clean ReagentIo instance");
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

	public void delete(ReagentIo persistentInstance)
	{
		log.debug("deleting ReagentIo instance");
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

	public ReagentIo merge(ReagentIo detachedInstance)
	{
		log.debug("merging ReagentIo instance");
		try
		{
			ReagentIo result = (ReagentIo) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReagentIo findById(int id)
	{
		log.debug("getting ReagentIo instance with id: " + id);
		try
		{
			ReagentIo instance = (ReagentIo) sessionFactory.getCurrentSession().get("deefw.ReagentIo", id);
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

	public List<ReagentIo> findByExample(ReagentIo instance)
	{
		log.debug("finding ReagentIo instance by example");
		try
		{
			List<ReagentIo> results = (List<ReagentIo>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReagentIo").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
