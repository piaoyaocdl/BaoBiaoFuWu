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
 * Home object for domain model class ReagentTemplate.
 * @see deefw.ReagentTemplate
 * @author Hibernate Tools
 */
public class ReagentTemplateHome
{

	private static final Log log = LogFactory.getLog(ReagentTemplateHome.class);

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

	public void persist(ReagentTemplate transientInstance)
	{
		log.debug("persisting ReagentTemplate instance");
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

	public void attachDirty(ReagentTemplate instance)
	{
		log.debug("attaching dirty ReagentTemplate instance");
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

	public void attachClean(ReagentTemplate instance)
	{
		log.debug("attaching clean ReagentTemplate instance");
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

	public void delete(ReagentTemplate persistentInstance)
	{
		log.debug("deleting ReagentTemplate instance");
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

	public ReagentTemplate merge(ReagentTemplate detachedInstance)
	{
		log.debug("merging ReagentTemplate instance");
		try
		{
			ReagentTemplate result = (ReagentTemplate) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReagentTemplate findById(int id)
	{
		log.debug("getting ReagentTemplate instance with id: " + id);
		try
		{
			ReagentTemplate instance = (ReagentTemplate) sessionFactory.getCurrentSession().get("deefw.ReagentTemplate",
					id);
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

	public List<ReagentTemplate> findByExample(ReagentTemplate instance)
	{
		log.debug("finding ReagentTemplate instance by example");
		try
		{
			List<ReagentTemplate> results = (List<ReagentTemplate>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReagentTemplate").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
