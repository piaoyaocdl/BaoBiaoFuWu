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
 * Home object for domain model class Yangbenjushou.
 * @see deefw.Yangbenjushou
 * @author Hibernate Tools
 */
public class YangbenjushouHome
{

	private static final Log log = LogFactory.getLog(YangbenjushouHome.class);

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

	public void persist(Yangbenjushou transientInstance)
	{
		log.debug("persisting Yangbenjushou instance");
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

	public void attachDirty(Yangbenjushou instance)
	{
		log.debug("attaching dirty Yangbenjushou instance");
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

	public void attachClean(Yangbenjushou instance)
	{
		log.debug("attaching clean Yangbenjushou instance");
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

	public void delete(Yangbenjushou persistentInstance)
	{
		log.debug("deleting Yangbenjushou instance");
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

	public Yangbenjushou merge(Yangbenjushou detachedInstance)
	{
		log.debug("merging Yangbenjushou instance");
		try
		{
			Yangbenjushou result = (Yangbenjushou) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Yangbenjushou findById(int id)
	{
		log.debug("getting Yangbenjushou instance with id: " + id);
		try
		{
			Yangbenjushou instance = (Yangbenjushou) sessionFactory.getCurrentSession().get("deefw.Yangbenjushou", id);
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

	public List<Yangbenjushou> findByExample(Yangbenjushou instance)
	{
		log.debug("finding Yangbenjushou instance by example");
		try
		{
			List<Yangbenjushou> results = (List<Yangbenjushou>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Yangbenjushou").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
