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
 * Home object for domain model class ReactionSetup.
 * @see deefw.ReactionSetup
 * @author Hibernate Tools
 */
public class ReactionSetupHome
{

	private static final Log log = LogFactory.getLog(ReactionSetupHome.class);

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

	public void persist(ReactionSetup transientInstance)
	{
		log.debug("persisting ReactionSetup instance");
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

	public void attachDirty(ReactionSetup instance)
	{
		log.debug("attaching dirty ReactionSetup instance");
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

	public void attachClean(ReactionSetup instance)
	{
		log.debug("attaching clean ReactionSetup instance");
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

	public void delete(ReactionSetup persistentInstance)
	{
		log.debug("deleting ReactionSetup instance");
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

	public ReactionSetup merge(ReactionSetup detachedInstance)
	{
		log.debug("merging ReactionSetup instance");
		try
		{
			ReactionSetup result = (ReactionSetup) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReactionSetup findById(int id)
	{
		log.debug("getting ReactionSetup instance with id: " + id);
		try
		{
			ReactionSetup instance = (ReactionSetup) sessionFactory.getCurrentSession().get("deefw.ReactionSetup", id);
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

	public List<ReactionSetup> findByExample(ReactionSetup instance)
	{
		log.debug("finding ReactionSetup instance by example");
		try
		{
			List<ReactionSetup> results = (List<ReactionSetup>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReactionSetup").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
