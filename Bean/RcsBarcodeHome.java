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
 * Home object for domain model class RcsBarcode.
 * @see deefw.RcsBarcode
 * @author Hibernate Tools
 */
public class RcsBarcodeHome
{

	private static final Log log = LogFactory.getLog(RcsBarcodeHome.class);

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

	public void persist(RcsBarcode transientInstance)
	{
		log.debug("persisting RcsBarcode instance");
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

	public void attachDirty(RcsBarcode instance)
	{
		log.debug("attaching dirty RcsBarcode instance");
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

	public void attachClean(RcsBarcode instance)
	{
		log.debug("attaching clean RcsBarcode instance");
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

	public void delete(RcsBarcode persistentInstance)
	{
		log.debug("deleting RcsBarcode instance");
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

	public RcsBarcode merge(RcsBarcode detachedInstance)
	{
		log.debug("merging RcsBarcode instance");
		try
		{
			RcsBarcode result = (RcsBarcode) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public RcsBarcode findById(int id)
	{
		log.debug("getting RcsBarcode instance with id: " + id);
		try
		{
			RcsBarcode instance = (RcsBarcode) sessionFactory.getCurrentSession().get("deefw.RcsBarcode", id);
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

	public List<RcsBarcode> findByExample(RcsBarcode instance)
	{
		log.debug("finding RcsBarcode instance by example");
		try
		{
			List<RcsBarcode> results = (List<RcsBarcode>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.RcsBarcode").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
