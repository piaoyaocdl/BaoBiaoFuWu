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
 * Home object for domain model class ReactionProg.
 * @see deefw.ReactionProg
 * @author Hibernate Tools
 */
public class ReactionProgHome
{

	private static final Log log = LogFactory.getLog(ReactionProgHome.class);

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

	public void persist(ReactionProg transientInstance)
	{
		log.debug("persisting ReactionProg instance");
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

	public void attachDirty(ReactionProg instance)
	{
		log.debug("attaching dirty ReactionProg instance");
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

	public void attachClean(ReactionProg instance)
	{
		log.debug("attaching clean ReactionProg instance");
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

	public void delete(ReactionProg persistentInstance)
	{
		log.debug("deleting ReactionProg instance");
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

	public ReactionProg merge(ReactionProg detachedInstance)
	{
		log.debug("merging ReactionProg instance");
		try
		{
			ReactionProg result = (ReactionProg) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReactionProg findById(int id)
	{
		log.debug("getting ReactionProg instance with id: " + id);
		try
		{
			ReactionProg instance = (ReactionProg) sessionFactory.getCurrentSession().get("deefw.ReactionProg", id);
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

	public List<ReactionProg> findByExample(ReactionProg instance)
	{
		log.debug("finding ReactionProg instance by example");
		try
		{
			List<ReactionProg> results = (List<ReactionProg>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReactionProg").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
