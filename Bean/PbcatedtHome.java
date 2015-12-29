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
 * Home object for domain model class Pbcatedt.
 * @see deefw.Pbcatedt
 * @author Hibernate Tools
 */
public class PbcatedtHome
{

	private static final Log log = LogFactory.getLog(PbcatedtHome.class);

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

	public void persist(Pbcatedt transientInstance)
	{
		log.debug("persisting Pbcatedt instance");
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

	public void attachDirty(Pbcatedt instance)
	{
		log.debug("attaching dirty Pbcatedt instance");
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

	public void attachClean(Pbcatedt instance)
	{
		log.debug("attaching clean Pbcatedt instance");
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

	public void delete(Pbcatedt persistentInstance)
	{
		log.debug("deleting Pbcatedt instance");
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

	public Pbcatedt merge(Pbcatedt detachedInstance)
	{
		log.debug("merging Pbcatedt instance");
		try
		{
			Pbcatedt result = (Pbcatedt) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pbcatedt findById(deefw.PbcatedtId id)
	{
		log.debug("getting Pbcatedt instance with id: " + id);
		try
		{
			Pbcatedt instance = (Pbcatedt) sessionFactory.getCurrentSession().get("deefw.Pbcatedt", id);
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

	public List<Pbcatedt> findByExample(Pbcatedt instance)
	{
		log.debug("finding Pbcatedt instance by example");
		try
		{
			List<Pbcatedt> results = (List<Pbcatedt>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Pbcatedt").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
