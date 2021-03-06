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
 * Home object for domain model class ResBloodPl.
 * @see deefw.ResBloodPl
 * @author Hibernate Tools
 */
public class ResBloodPlHome
{

	private static final Log log = LogFactory.getLog(ResBloodPlHome.class);

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

	public void persist(ResBloodPl transientInstance)
	{
		log.debug("persisting ResBloodPl instance");
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

	public void attachDirty(ResBloodPl instance)
	{
		log.debug("attaching dirty ResBloodPl instance");
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

	public void attachClean(ResBloodPl instance)
	{
		log.debug("attaching clean ResBloodPl instance");
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

	public void delete(ResBloodPl persistentInstance)
	{
		log.debug("deleting ResBloodPl instance");
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

	public ResBloodPl merge(ResBloodPl detachedInstance)
	{
		log.debug("merging ResBloodPl instance");
		try
		{
			ResBloodPl result = (ResBloodPl) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResBloodPl findById(int id)
	{
		log.debug("getting ResBloodPl instance with id: " + id);
		try
		{
			ResBloodPl instance = (ResBloodPl) sessionFactory.getCurrentSession().get("deefw.ResBloodPl", id);
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

	public List<ResBloodPl> findByExample(ResBloodPl instance)
	{
		log.debug("finding ResBloodPl instance by example");
		try
		{
			List<ResBloodPl> results = (List<ResBloodPl>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ResBloodPl").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
