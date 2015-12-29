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
 * Home object for domain model class Pbcatvld.
 * @see deefw.Pbcatvld
 * @author Hibernate Tools
 */
public class PbcatvldHome
{

	private static final Log log = LogFactory.getLog(PbcatvldHome.class);

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

	public void persist(Pbcatvld transientInstance)
	{
		log.debug("persisting Pbcatvld instance");
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

	public void attachDirty(Pbcatvld instance)
	{
		log.debug("attaching dirty Pbcatvld instance");
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

	public void attachClean(Pbcatvld instance)
	{
		log.debug("attaching clean Pbcatvld instance");
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

	public void delete(Pbcatvld persistentInstance)
	{
		log.debug("deleting Pbcatvld instance");
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

	public Pbcatvld merge(Pbcatvld detachedInstance)
	{
		log.debug("merging Pbcatvld instance");
		try
		{
			Pbcatvld result = (Pbcatvld) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pbcatvld findById(deefw.PbcatvldId id)
	{
		log.debug("getting Pbcatvld instance with id: " + id);
		try
		{
			Pbcatvld instance = (Pbcatvld) sessionFactory.getCurrentSession().get("deefw.Pbcatvld", id);
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

	public List<Pbcatvld> findByExample(Pbcatvld instance)
	{
		log.debug("finding Pbcatvld instance by example");
		try
		{
			List<Pbcatvld> results = (List<Pbcatvld>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Pbcatvld").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
