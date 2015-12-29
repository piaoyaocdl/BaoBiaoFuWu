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
 * Home object for domain model class Pbcatcol.
 * @see deefw.Pbcatcol
 * @author Hibernate Tools
 */
public class PbcatcolHome
{

	private static final Log log = LogFactory.getLog(PbcatcolHome.class);

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

	public void persist(Pbcatcol transientInstance)
	{
		log.debug("persisting Pbcatcol instance");
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

	public void attachDirty(Pbcatcol instance)
	{
		log.debug("attaching dirty Pbcatcol instance");
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

	public void attachClean(Pbcatcol instance)
	{
		log.debug("attaching clean Pbcatcol instance");
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

	public void delete(Pbcatcol persistentInstance)
	{
		log.debug("deleting Pbcatcol instance");
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

	public Pbcatcol merge(Pbcatcol detachedInstance)
	{
		log.debug("merging Pbcatcol instance");
		try
		{
			Pbcatcol result = (Pbcatcol) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pbcatcol findById(deefw.PbcatcolId id)
	{
		log.debug("getting Pbcatcol instance with id: " + id);
		try
		{
			Pbcatcol instance = (Pbcatcol) sessionFactory.getCurrentSession().get("deefw.Pbcatcol", id);
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

	public List<Pbcatcol> findByExample(Pbcatcol instance)
	{
		log.debug("finding Pbcatcol instance by example");
		try
		{
			List<Pbcatcol> results = (List<Pbcatcol>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Pbcatcol").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
