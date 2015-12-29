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
 * Home object for domain model class QcInner.
 * @see deefw.QcInner
 * @author Hibernate Tools
 */
public class QcInnerHome
{

	private static final Log log = LogFactory.getLog(QcInnerHome.class);

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

	public void persist(QcInner transientInstance)
	{
		log.debug("persisting QcInner instance");
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

	public void attachDirty(QcInner instance)
	{
		log.debug("attaching dirty QcInner instance");
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

	public void attachClean(QcInner instance)
	{
		log.debug("attaching clean QcInner instance");
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

	public void delete(QcInner persistentInstance)
	{
		log.debug("deleting QcInner instance");
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

	public QcInner merge(QcInner detachedInstance)
	{
		log.debug("merging QcInner instance");
		try
		{
			QcInner result = (QcInner) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public QcInner findById(int id)
	{
		log.debug("getting QcInner instance with id: " + id);
		try
		{
			QcInner instance = (QcInner) sessionFactory.getCurrentSession().get("deefw.QcInner", id);
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

	public List<QcInner> findByExample(QcInner instance)
	{
		log.debug("finding QcInner instance by example");
		try
		{
			List<QcInner> results = (List<QcInner>) sessionFactory.getCurrentSession().createCriteria("deefw.QcInner")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
