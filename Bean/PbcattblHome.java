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
 * Home object for domain model class Pbcattbl.
 * @see deefw.Pbcattbl
 * @author Hibernate Tools
 */
public class PbcattblHome
{

	private static final Log log = LogFactory.getLog(PbcattblHome.class);

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

	public void persist(Pbcattbl transientInstance)
	{
		log.debug("persisting Pbcattbl instance");
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

	public void attachDirty(Pbcattbl instance)
	{
		log.debug("attaching dirty Pbcattbl instance");
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

	public void attachClean(Pbcattbl instance)
	{
		log.debug("attaching clean Pbcattbl instance");
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

	public void delete(Pbcattbl persistentInstance)
	{
		log.debug("deleting Pbcattbl instance");
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

	public Pbcattbl merge(Pbcattbl detachedInstance)
	{
		log.debug("merging Pbcattbl instance");
		try
		{
			Pbcattbl result = (Pbcattbl) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pbcattbl findById(deefw.PbcattblId id)
	{
		log.debug("getting Pbcattbl instance with id: " + id);
		try
		{
			Pbcattbl instance = (Pbcattbl) sessionFactory.getCurrentSession().get("deefw.Pbcattbl", id);
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

	public List<Pbcattbl> findByExample(Pbcattbl instance)
	{
		log.debug("finding Pbcattbl instance by example");
		try
		{
			List<Pbcattbl> results = (List<Pbcattbl>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Pbcattbl").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
