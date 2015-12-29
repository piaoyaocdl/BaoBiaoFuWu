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
 * Home object for domain model class ReagentTemplateDetail.
 * @see deefw.ReagentTemplateDetail
 * @author Hibernate Tools
 */
public class ReagentTemplateDetailHome
{

	private static final Log log = LogFactory.getLog(ReagentTemplateDetailHome.class);

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

	public void persist(ReagentTemplateDetail transientInstance)
	{
		log.debug("persisting ReagentTemplateDetail instance");
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

	public void attachDirty(ReagentTemplateDetail instance)
	{
		log.debug("attaching dirty ReagentTemplateDetail instance");
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

	public void attachClean(ReagentTemplateDetail instance)
	{
		log.debug("attaching clean ReagentTemplateDetail instance");
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

	public void delete(ReagentTemplateDetail persistentInstance)
	{
		log.debug("deleting ReagentTemplateDetail instance");
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

	public ReagentTemplateDetail merge(ReagentTemplateDetail detachedInstance)
	{
		log.debug("merging ReagentTemplateDetail instance");
		try
		{
			ReagentTemplateDetail result = (ReagentTemplateDetail) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReagentTemplateDetail findById(int id)
	{
		log.debug("getting ReagentTemplateDetail instance with id: " + id);
		try
		{
			ReagentTemplateDetail instance = (ReagentTemplateDetail) sessionFactory.getCurrentSession()
					.get("deefw.ReagentTemplateDetail", id);
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

	public List<ReagentTemplateDetail> findByExample(ReagentTemplateDetail instance)
	{
		log.debug("finding ReagentTemplateDetail instance by example");
		try
		{
			List<ReagentTemplateDetail> results = (List<ReagentTemplateDetail>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReagentTemplateDetail").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
