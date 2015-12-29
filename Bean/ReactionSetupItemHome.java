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
 * Home object for domain model class ReactionSetupItem.
 * @see deefw.ReactionSetupItem
 * @author Hibernate Tools
 */
public class ReactionSetupItemHome
{

	private static final Log log = LogFactory.getLog(ReactionSetupItemHome.class);

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

	public void persist(ReactionSetupItem transientInstance)
	{
		log.debug("persisting ReactionSetupItem instance");
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

	public void attachDirty(ReactionSetupItem instance)
	{
		log.debug("attaching dirty ReactionSetupItem instance");
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

	public void attachClean(ReactionSetupItem instance)
	{
		log.debug("attaching clean ReactionSetupItem instance");
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

	public void delete(ReactionSetupItem persistentInstance)
	{
		log.debug("deleting ReactionSetupItem instance");
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

	public ReactionSetupItem merge(ReactionSetupItem detachedInstance)
	{
		log.debug("merging ReactionSetupItem instance");
		try
		{
			ReactionSetupItem result = (ReactionSetupItem) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReactionSetupItem findById(int id)
	{
		log.debug("getting ReactionSetupItem instance with id: " + id);
		try
		{
			ReactionSetupItem instance = (ReactionSetupItem) sessionFactory.getCurrentSession()
					.get("deefw.ReactionSetupItem", id);
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

	public List<ReactionSetupItem> findByExample(ReactionSetupItem instance)
	{
		log.debug("finding ReactionSetupItem instance by example");
		try
		{
			List<ReactionSetupItem> results = (List<ReactionSetupItem>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReactionSetupItem").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
