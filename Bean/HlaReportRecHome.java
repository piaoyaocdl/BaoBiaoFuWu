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
 * Home object for domain model class HlaReportRec.
 * @see deefw.HlaReportRec
 * @author Hibernate Tools
 */
public class HlaReportRecHome
{

	private static final Log log = LogFactory.getLog(HlaReportRecHome.class);

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

	public void persist(HlaReportRec transientInstance)
	{
		log.debug("persisting HlaReportRec instance");
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

	public void attachDirty(HlaReportRec instance)
	{
		log.debug("attaching dirty HlaReportRec instance");
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

	public void attachClean(HlaReportRec instance)
	{
		log.debug("attaching clean HlaReportRec instance");
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

	public void delete(HlaReportRec persistentInstance)
	{
		log.debug("deleting HlaReportRec instance");
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

	public HlaReportRec merge(HlaReportRec detachedInstance)
	{
		log.debug("merging HlaReportRec instance");
		try
		{
			HlaReportRec result = (HlaReportRec) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaReportRec findById(int id)
	{
		log.debug("getting HlaReportRec instance with id: " + id);
		try
		{
			HlaReportRec instance = (HlaReportRec) sessionFactory.getCurrentSession().get("deefw.HlaReportRec", id);
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

	public List<HlaReportRec> findByExample(HlaReportRec instance)
	{
		log.debug("finding HlaReportRec instance by example");
		try
		{
			List<HlaReportRec> results = (List<HlaReportRec>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.HlaReportRec").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
