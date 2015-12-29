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
 * Home object for domain model class HlaConcentration.
 * @see deefw.HlaConcentration
 * @author Hibernate Tools
 */
public class HlaConcentrationHome
{

	private static final Log log = LogFactory.getLog(HlaConcentrationHome.class);

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

	public void persist(HlaConcentration transientInstance)
	{
		log.debug("persisting HlaConcentration instance");
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

	public void attachDirty(HlaConcentration instance)
	{
		log.debug("attaching dirty HlaConcentration instance");
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

	public void attachClean(HlaConcentration instance)
	{
		log.debug("attaching clean HlaConcentration instance");
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

	public void delete(HlaConcentration persistentInstance)
	{
		log.debug("deleting HlaConcentration instance");
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

	public HlaConcentration merge(HlaConcentration detachedInstance)
	{
		log.debug("merging HlaConcentration instance");
		try
		{
			HlaConcentration result = (HlaConcentration) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public HlaConcentration findById(int id)
	{
		log.debug("getting HlaConcentration instance with id: " + id);
		try
		{
			HlaConcentration instance = (HlaConcentration) sessionFactory.getCurrentSession()
					.get("deefw.HlaConcentration", id);
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

	public List<HlaConcentration> findByExample(HlaConcentration instance)
	{
		log.debug("finding HlaConcentration instance by example");
		try
		{
			List<HlaConcentration> results = (List<HlaConcentration>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.HlaConcentration").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
