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
 * Home object for domain model class ResAccidentAb.
 * @see deefw.ResAccidentAb
 * @author Hibernate Tools
 */
public class ResAccidentAbHome
{

	private static final Log log = LogFactory.getLog(ResAccidentAbHome.class);

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

	public void persist(ResAccidentAb transientInstance)
	{
		log.debug("persisting ResAccidentAb instance");
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

	public void attachDirty(ResAccidentAb instance)
	{
		log.debug("attaching dirty ResAccidentAb instance");
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

	public void attachClean(ResAccidentAb instance)
	{
		log.debug("attaching clean ResAccidentAb instance");
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

	public void delete(ResAccidentAb persistentInstance)
	{
		log.debug("deleting ResAccidentAb instance");
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

	public ResAccidentAb merge(ResAccidentAb detachedInstance)
	{
		log.debug("merging ResAccidentAb instance");
		try
		{
			ResAccidentAb result = (ResAccidentAb) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResAccidentAb findById(int id)
	{
		log.debug("getting ResAccidentAb instance with id: " + id);
		try
		{
			ResAccidentAb instance = (ResAccidentAb) sessionFactory.getCurrentSession().get("deefw.ResAccidentAb", id);
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

	public List<ResAccidentAb> findByExample(ResAccidentAb instance)
	{
		log.debug("finding ResAccidentAb instance by example");
		try
		{
			List<ResAccidentAb> results = (List<ResAccidentAb>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResAccidentAb").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
