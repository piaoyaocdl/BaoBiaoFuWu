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
 * Home object for domain model class HlaReportHead.
 * @see deefw.HlaReportHead
 * @author Hibernate Tools
 */
public class HlaReportHeadHome
{

	private static final Log log = LogFactory.getLog(HlaReportHeadHome.class);

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

	public void persist(HlaReportHead transientInstance)
	{
		log.debug("persisting HlaReportHead instance");
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

	public void attachDirty(HlaReportHead instance)
	{
		log.debug("attaching dirty HlaReportHead instance");
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

	public void attachClean(HlaReportHead instance)
	{
		log.debug("attaching clean HlaReportHead instance");
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

	public void delete(HlaReportHead persistentInstance)
	{
		log.debug("deleting HlaReportHead instance");
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

	public HlaReportHead merge(HlaReportHead detachedInstance)
	{
		log.debug("merging HlaReportHead instance");
		try
		{
			HlaReportHead result = (HlaReportHead) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaReportHead findById(int id)
	{
		log.debug("getting HlaReportHead instance with id: " + id);
		try
		{
			HlaReportHead instance = (HlaReportHead) sessionFactory.getCurrentSession().get("deefw.HlaReportHead", id);
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

	public List<HlaReportHead> findByExample(HlaReportHead instance)
	{
		log.debug("finding HlaReportHead instance by example");
		try
		{
			List<HlaReportHead> results = (List<HlaReportHead>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.HlaReportHead").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
