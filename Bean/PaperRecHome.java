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
 * Home object for domain model class PaperRec.
 * @see deefw.PaperRec
 * @author Hibernate Tools
 */
public class PaperRecHome
{

	private static final Log log = LogFactory.getLog(PaperRecHome.class);

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

	public void persist(PaperRec transientInstance)
	{
		log.debug("persisting PaperRec instance");
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

	public void attachDirty(PaperRec instance)
	{
		log.debug("attaching dirty PaperRec instance");
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

	public void attachClean(PaperRec instance)
	{
		log.debug("attaching clean PaperRec instance");
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

	public void delete(PaperRec persistentInstance)
	{
		log.debug("deleting PaperRec instance");
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

	public PaperRec merge(PaperRec detachedInstance)
	{
		log.debug("merging PaperRec instance");
		try
		{
			PaperRec result = (PaperRec) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaperRec findById(int id)
	{
		log.debug("getting PaperRec instance with id: " + id);
		try
		{
			PaperRec instance = (PaperRec) sessionFactory.getCurrentSession().get("deefw.PaperRec", id);
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

	public List<PaperRec> findByExample(PaperRec instance)
	{
		log.debug("finding PaperRec instance by example");
		try
		{
			List<PaperRec> results = (List<PaperRec>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.PaperRec").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
