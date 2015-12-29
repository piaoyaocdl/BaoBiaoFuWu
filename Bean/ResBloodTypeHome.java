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
 * Home object for domain model class ResBloodType.
 * @see deefw.ResBloodType
 * @author Hibernate Tools
 */
public class ResBloodTypeHome
{

	private static final Log log = LogFactory.getLog(ResBloodTypeHome.class);

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

	public void persist(ResBloodType transientInstance)
	{
		log.debug("persisting ResBloodType instance");
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

	public void attachDirty(ResBloodType instance)
	{
		log.debug("attaching dirty ResBloodType instance");
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

	public void attachClean(ResBloodType instance)
	{
		log.debug("attaching clean ResBloodType instance");
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

	public void delete(ResBloodType persistentInstance)
	{
		log.debug("deleting ResBloodType instance");
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

	public ResBloodType merge(ResBloodType detachedInstance)
	{
		log.debug("merging ResBloodType instance");
		try
		{
			ResBloodType result = (ResBloodType) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResBloodType findById(int id)
	{
		log.debug("getting ResBloodType instance with id: " + id);
		try
		{
			ResBloodType instance = (ResBloodType) sessionFactory.getCurrentSession().get("deefw.ResBloodType", id);
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

	public List<ResBloodType> findByExample(ResBloodType instance)
	{
		log.debug("finding ResBloodType instance by example");
		try
		{
			List<ResBloodType> results = (List<ResBloodType>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResBloodType").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
