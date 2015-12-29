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
 * Home object for domain model class ReportPrintRec.
 * @see deefw.ReportPrintRec
 * @author Hibernate Tools
 */
public class ReportPrintRecHome
{

	private static final Log log = LogFactory.getLog(ReportPrintRecHome.class);

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

	public void persist(ReportPrintRec transientInstance)
	{
		log.debug("persisting ReportPrintRec instance");
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

	public void attachDirty(ReportPrintRec instance)
	{
		log.debug("attaching dirty ReportPrintRec instance");
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

	public void attachClean(ReportPrintRec instance)
	{
		log.debug("attaching clean ReportPrintRec instance");
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

	public void delete(ReportPrintRec persistentInstance)
	{
		log.debug("deleting ReportPrintRec instance");
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

	public ReportPrintRec merge(ReportPrintRec detachedInstance)
	{
		log.debug("merging ReportPrintRec instance");
		try
		{
			ReportPrintRec result = (ReportPrintRec) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReportPrintRec findById(int id)
	{
		log.debug("getting ReportPrintRec instance with id: " + id);
		try
		{
			ReportPrintRec instance = (ReportPrintRec) sessionFactory.getCurrentSession().get("deefw.ReportPrintRec",
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

	public List<ReportPrintRec> findByExample(ReportPrintRec instance)
	{
		log.debug("finding ReportPrintRec instance by example");
		try
		{
			List<ReportPrintRec> results = (List<ReportPrintRec>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReportPrintRec").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
