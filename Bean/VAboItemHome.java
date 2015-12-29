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
 * Home object for domain model class VAboItem.
 * @see deefw.VAboItem
 * @author Hibernate Tools
 */
public class VAboItemHome
{

	private static final Log log = LogFactory.getLog(VAboItemHome.class);

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

	public void persist(VAboItem transientInstance)
	{
		log.debug("persisting VAboItem instance");
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

	public void attachDirty(VAboItem instance)
	{
		log.debug("attaching dirty VAboItem instance");
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

	public void attachClean(VAboItem instance)
	{
		log.debug("attaching clean VAboItem instance");
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

	public void delete(VAboItem persistentInstance)
	{
		log.debug("deleting VAboItem instance");
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

	public VAboItem merge(VAboItem detachedInstance)
	{
		log.debug("merging VAboItem instance");
		try
		{
			VAboItem result = (VAboItem) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public VAboItem findById(deefw.VAboItemId id)
	{
		log.debug("getting VAboItem instance with id: " + id);
		try
		{
			VAboItem instance = (VAboItem) sessionFactory.getCurrentSession().get("deefw.VAboItem", id);
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

	public List<VAboItem> findByExample(VAboItem instance)
	{
		log.debug("finding VAboItem instance by example");
		try
		{
			List<VAboItem> results = (List<VAboItem>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.VAboItem").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
