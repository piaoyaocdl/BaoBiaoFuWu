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
 * Home object for domain model class Pbcatfmt.
 * @see deefw.Pbcatfmt
 * @author Hibernate Tools
 */
public class PbcatfmtHome
{

	private static final Log log = LogFactory.getLog(PbcatfmtHome.class);

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

	public void persist(Pbcatfmt transientInstance)
	{
		log.debug("persisting Pbcatfmt instance");
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

	public void attachDirty(Pbcatfmt instance)
	{
		log.debug("attaching dirty Pbcatfmt instance");
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

	public void attachClean(Pbcatfmt instance)
	{
		log.debug("attaching clean Pbcatfmt instance");
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

	public void delete(Pbcatfmt persistentInstance)
	{
		log.debug("deleting Pbcatfmt instance");
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

	public Pbcatfmt merge(Pbcatfmt detachedInstance)
	{
		log.debug("merging Pbcatfmt instance");
		try
		{
			Pbcatfmt result = (Pbcatfmt) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pbcatfmt findById(deefw.PbcatfmtId id)
	{
		log.debug("getting Pbcatfmt instance with id: " + id);
		try
		{
			Pbcatfmt instance = (Pbcatfmt) sessionFactory.getCurrentSession().get("deefw.Pbcatfmt", id);
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

	public List<Pbcatfmt> findByExample(Pbcatfmt instance)
	{
		log.debug("finding Pbcatfmt instance by example");
		try
		{
			List<Pbcatfmt> results = (List<Pbcatfmt>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.Pbcatfmt").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
